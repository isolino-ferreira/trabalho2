package br.edu.ifes.sr.poo2.teste;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifes.sr.poo2.api.RespostaAPI;
import br.edu.ifes.sr.poo2.api.RespostaAPIImpl;
import br.edu.ifes.sr.poo2.api.model.RespostaTerceiro;

public class RespostaTest {

	private RespostaAPI respostaAPI;
	private RespostaTerceiro resposta;
	
	@Before
	public void before(){
		
		respostaAPI = new RespostaAPIImpl();
		resposta = new RespostaTerceiro();
		resposta.setResposta("Brasilia");
		
	}
	
	@Test
	public void isWorking(){
		boolean resposta = respostaAPI.isWorking();
		
		Assert.assertTrue(resposta);
	}
	
	@Test
	public void addTest() throws Exception{
		
		int id = respostaAPI.adicionar(resposta);
		
		Assert.assertNotSame(0,id);
		
		resposta = new RespostaTerceiro();
		resposta.setResposta("Ancara");
		resposta.setVerdadeiro(true);
		
		id = respostaAPI.adicionar(resposta);
		
		
		Assert.assertNotSame(0,id);
		
	}
	

}
