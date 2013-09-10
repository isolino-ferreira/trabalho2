package controller;

import java.util.List;

import model.MetodoFabricaPergunta;
import util.Leitor;
import view.PerguntaView;
import view.RespostaView;
import br.edu.ifes.sr.poo2.api.PerguntaAPI;
import br.edu.ifes.sr.poo2.api.PerguntaAPIImpl;
import br.edu.ifes.sr.poo2.api.model.PerguntaTerceiro;
import br.edu.ifes.sr.poo2.api.model.RespostaTerceiro;


public class PerguntaController {
	
	private PerguntaAPI perguntaAPI = new PerguntaAPIImpl();
	
	public PerguntaTerceiro criarPergunta(){
		
		PerguntaTerceiro pergunta = null;
		String opcao=" ";
		
		while(!opcao.equals("0")){
			
			PerguntaView.addNivel();
			opcao = Leitor.ler();
			
			switch(opcao){
			
				case ("1"):
					
					pergunta = MetodoFabricaPergunta.getInstance("FACIL");
					opcao="0";
					break;
					
				case("2"):
					
					pergunta = MetodoFabricaPergunta.getInstance("MEDIO");
					opcao="0";	
					break;
				
				case("3"):
					
					pergunta = MetodoFabricaPergunta.getInstance("DIFICIL");
					opcao="0";
					break;
			
				default:			
					System.out.println("Opcao invalida");
					break;

			}
		
		}
		return pergunta;
	}

	public void preencher(PerguntaTerceiro p){
		
		PerguntaView.addTexto();
		
		p.setValor(Leitor.ler());
		
		for (RespostaTerceiro r : p.getRespostas()) {
			
			RespostaView.addValor();
			
			r.setResposta(Leitor.ler());
			
		}
		
		escolherRespostaCorreta(p);
		
	}

	public void escolherRespostaCorreta(PerguntaTerceiro p){
		
		RespostaView.setCorreta();
		
		RespostaView.mostrarValores(p.getRespostas());
		
		RespostaTerceiro r = null;
		
		boolean vai = true;
		
		while(vai){
			
			String opcao = Leitor.ler();
			
			switch(opcao){
			
			case("1"):
				
				r = p.getRespostas().get(0);
				vai = false;
			
			break;
			
			case("2"):
				
				r = p.getRespostas().get(1);
				vai = false;
			
			break;
			
			case("3"):
				
				r = p.getRespostas().get(2);
				vai = false;
			
			break;
			
			default:
				
				RespostaView.erro();
			
			}
		}
		
		r.setVerdadeiro(true);
		
	}

	public void cadastrar(PerguntaTerceiro p) throws Exception {
		// TODO Auto-generated method stub
		perguntaAPI.adicionar(p);
	}

	public void deletar() {
		// TODO Auto-generated method stub
		int entrada = 0;
		
		int deletando = 0;
		
		List<PerguntaTerceiro> perguntas = null;;
		
		try {
			
			perguntas = perguntaAPI.getAll();
			
			PerguntaView.listarTodas(perguntas);
			
		} catch (Exception e) {System.out.println("Erro ao listar");}
		
		try {
			
			entrada = Integer.parseInt(Leitor.ler());
			
			deletando = perguntas.get(entrada).getId().intValue();
			
		} catch(Exception e){System.out.println("Erro ao escolher");};
		
		try{
			
			perguntaAPI.delete(deletando);
			
		}catch(Exception e){System.out.println("Esta pergunta ja foi respondida ou não existe, por isso não pode ser apagada");};
		
		
		
	}
}