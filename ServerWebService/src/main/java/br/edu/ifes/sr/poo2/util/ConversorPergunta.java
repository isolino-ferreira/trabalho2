package br.edu.ifes.sr.poo2.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.edu.ifes.sr.poo2.api.model.Jogo;
import br.edu.ifes.sr.poo2.api.model.Pergunta;
import br.edu.ifes.sr.poo2.api.model.Resposta;
import br.edu.ifes.sr.poo2.model.JogoImpl;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;
import br.edu.ifes.sr.poo2.model.RespostaImpl;

public class ConversorPergunta {

	public static Pergunta toPergunta(PerguntaImpl pergunta){
		Pergunta perg = new Pergunta();
			
		perg.setValor(pergunta.getValor());
		
		perg.setId(pergunta.getId().intValue());
		
		Iterator<RespostaImpl> iRespostas = pergunta.getRespostas().iterator();
		
		while(iRespostas.hasNext()){
			Resposta r = new Resposta();
			RespostaImpl rImpl = (RespostaImpl)iRespostas.next();
			r.setId(rImpl.getId().intValue());
			r.setResposta(rImpl.getResposta());
			perg.add(r);
		}
		return perg;
	}
	
	public static List<Pergunta> toPergunta(List<PerguntaImpl> perguntas){
		
		List<Pergunta> perg=  new ArrayList<Pergunta>();
		
		for (PerguntaImpl p : perguntas) {
			
			perg.add(toPergunta(p));
			
		}
		return perg;
	}

	public static List<PerguntaImpl> toPerguntaImpl(List<Pergunta> perguntas) {
		// TODO Auto-generated method stub
		List<PerguntaImpl> perg = new ArrayList<PerguntaImpl>();
		
		PerguntaImpl perguntaImpl;
		
		for (Pergunta p : perguntas){
			
			perguntaImpl = new PerguntaImpl();
			
			perguntaImpl.setId(new Long(p.getId()));
			
			perguntaImpl.setValor(p.getValor());
			
			for (Resposta r : p.getRespostas()){
				
				RespostaImpl respT = new RespostaImpl();
				
				respT.setId(new Long(r.getId()));
				
				respT.setResposta(r.getResposta());
				
				perguntaImpl.addResposta(respT);
			}
			
			perg.add(perguntaImpl);
			
		}
		
		return perg;
	}

	public static JogoImpl toJogoImpl(Jogo j) {
		// TODO Auto-generated method stub
		JogoImpl novoJogo = new JogoImpl();
		
		novoJogo.setUsername(j.getUsername());
		
		novoJogo.setPerguntas(toPerguntaImpl(j.getPerguntas()));
		
		return novoJogo;
	}
	
	public static List<Jogo> toJogo(List<JogoImpl> jogos){
		
		List<Jogo> listaNova = new ArrayList<Jogo>();
		
		for(JogoImpl j: jogos){
			
			Jogo novoJogo = new Jogo();
		
			novoJogo.setIdJogo(j.getId().intValue());
			
			novoJogo.setUsername(j.getUsername());
		
			novoJogo.setPerguntas(toPergunta(j.getPerguntas()));
			
			listaNova.add(novoJogo);
		}
		
		
		return listaNova;
		
	}
}
