package br.edu.ifes.sr.poo2.teste;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifes.sr.poo2.api.PerguntaAPI;
import br.edu.ifes.sr.poo2.api.PerguntaAPIImpl;
import br.edu.ifes.sr.poo2.api.model.PerguntaTerceiro;
import br.edu.ifes.sr.poo2.api.model.RespostaTerceiro;

public class PerguntaTest {
	
	private PerguntaAPI perguntaAPI;
	private PerguntaTerceiro pergunta;
	
	@Before
	public void before() throws Exception{
		
		perguntaAPI = new PerguntaAPIImpl();
		pergunta = new PerguntaTerceiro();
		pergunta.setValor("Qual maior pais do mundo?");
		
		RespostaTerceiro r1 = new RespostaTerceiro();
		r1.setResposta("China");
		r1.setVerdadeiro(false);
		pergunta.addResposta(r1);
		
		
		
	}
	
	@Test
	public void isWorking(){
		boolean resposta = perguntaAPI.isWorking();
		
		Assert.assertTrue(resposta);
	}
	
	@Test
	public void addPerguntaTest() throws Exception{
		
		

		
		int id = perguntaAPI.adicionar(pergunta);
		System.out.println(id);
		
		Assert.assertNotSame(0,id);
		
	}
	
	

}
