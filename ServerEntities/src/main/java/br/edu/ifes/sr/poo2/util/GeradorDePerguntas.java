package br.edu.ifes.sr.poo2.util;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifes.sr.poo2.model.PerguntaImpl;

public class GeradorDePerguntas {
	
	public static List<PerguntaImpl> gerar(){
		List<PerguntaImpl> todasPerguntas = new ArrayList<PerguntaImpl>();
		
		PerguntaImpl pergunta;
		
		//criando perguntas faceis
		
		pergunta = new PerguntaImpl();
		pergunta.setValor("");//QUIZ NA AREA DE TRABALHO
		
		
		
		return todasPerguntas;
	}

}
