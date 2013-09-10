package br.edu.ifes.sr.poo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.ifes.sr.poo2.api.PontoAPI;
import br.edu.ifes.sr.poo2.api.PontoAPIIMpl;
import br.edu.ifes.sr.poo2.api.model.Jogo;
import br.edu.ifes.sr.poo2.api.model.Pergunta;
import br.edu.ifes.sr.poo2.api.model.Ponto;
import br.edu.ifes.sr.poo2.fabrica.MetodoFabricaJogo;
import br.edu.ifes.sr.poo2.model.JogoImpl;
import br.edu.ifes.sr.poo2.model.JogoTerceiro;
import br.edu.ifes.sr.poo2.model.NivelTerceiro;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;
import br.edu.ifes.sr.poo2.model.PerguntaTerceiro;
import br.edu.ifes.sr.poo2.model.RespostaTerceiro;
import br.edu.ifes.sr.poo2.service.JogoService;
import br.edu.ifes.sr.poo2.service.MeuServicoService;
import br.edu.ifes.sr.poo2.service.PerguntaService;
import br.edu.ifes.sr.poo2.service.RespostaService;
import br.edu.ifes.sr.poo2.util.ConversorPergunta;

@Controller
@RequestMapping("/jogar")
public class JogoController extends AbstractController {
	
	@Autowired
	private MeuServicoService serviceMeuServico;
	
	@Autowired
	private PerguntaService servicePergunta;
	
	@Autowired
	private RespostaService serviceResposta;
	
	@Autowired
	private JogoService serviceJogo;
	
	@RequestMapping(value = "/partida/{username}/{nivel}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Jogo> jogar(@PathVariable String username,@PathVariable String nivel){
		try{
			
			List<PerguntaImpl> perguntas;
			
			if(nivel.equals("FACIL"))
				perguntas = servicePergunta.findByNivel(NivelTerceiro.FACIL);
			else if(nivel.equals("DIFICIL"))
				perguntas = servicePergunta.findByNivel(NivelTerceiro.DIFICIL);
			else if(nivel.equals("MEDIO"))
				perguntas = servicePergunta.findByNivel(NivelTerceiro.MEDIO);
			else
				perguntas = servicePergunta.findAll();
			
			
			JogoTerceiro j = MetodoFabricaJogo.getInstance(perguntas);
			
			j.setUsername(username);
			
			serviceJogo.save((JogoImpl)j);
			
			Jogo jogo = new Jogo();
			
			List<Pergunta> porgunta = ConversorPergunta.toPergunta(j.getPerguntas());

			jogo.setUsername(username);
			
			jogo.setIdJogo(((JogoImpl)j).getId().intValue());
			
			jogo.setPerguntas(porgunta);
			
			return new ResponseEntity<Jogo>(jogo, HttpStatus.OK);
			
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<Jogo>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/responder/", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Long> responder(@RequestBody Jogo j){
		
		try{
			
			int pontos = 0;
			
			PontoAPI pontoAPI;
			
			for(Pergunta p : j.getPerguntas()){
				
				PerguntaTerceiro perg = servicePergunta.find( p.getId() );
				
				RespostaTerceiro resp;
				
				if (p.getRespostas().size()>=1){
					
					resp = serviceResposta.find(p.getRespostas().get(0).getId());
					
					if (resp.isVerdadeiro()){
						
						if (perg.getNivel() == NivelTerceiro.FACIL) {
							pontos ++;
						}else if(perg.getNivel() == NivelTerceiro.MEDIO){
							pontos = pontos + 2;
						}else{
							pontos += 3;
						}
					}
				}
					
				
			}
			
			Ponto ponto = new Ponto();
			
			ponto.setUserName(j.getUsername());
			
			int idServico = serviceMeuServico.findAll().get(0).getIdServico();
				
			ponto.setIdServico(idServico);
			
			pontoAPI = new PontoAPIIMpl();
			
			//incrementa a pontuação do username no meu quiz (idServico)
			Long pontosCorrentes = pontoAPI.getPonto(j.getUsername(),new Long( idServico));
			
			if(pontosCorrentes==-1)
				pontosCorrentes = (long) 0;
			
			ponto.setValor( pontos + pontosCorrentes);
			
			pontoAPI.setPonto(ponto);
			
			
			//salvar jogo
			JogoImpl jogoConvertido = serviceJogo.find(j.getIdJogo());
			
			jogoConvertido.setPontos(pontos);
			
			serviceJogo.save(jogoConvertido);
			
			return new ResponseEntity<Long>(new Long(pontos), HttpStatus.OK);
			
		}catch(Exception e){
			return new ResponseEntity<Long>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Jogo>> getall(){
		
		try{
			
			List<Jogo> jogos = ConversorPergunta.toJogo(serviceJogo.findAll());
			
			return new ResponseEntity<List<Jogo>>(jogos, HttpStatus.OK);
			
			
		}catch(Exception e){
			return new ResponseEntity<List<Jogo>>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@RequestMapping(value = "/ranking", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<String>> getRanking(){
		
		try{
			
			List<String> ranking = serviceJogo.listarPorUsernameCrescente();
			
			return new ResponseEntity<List<String>>(ranking, HttpStatus.OK);
			
			
		}catch(Exception e){
			return new ResponseEntity<List<String>>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
