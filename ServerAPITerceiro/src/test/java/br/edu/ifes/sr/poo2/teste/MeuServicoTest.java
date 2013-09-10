package br.edu.ifes.sr.poo2.teste;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifes.sr.poo2.api.MeuServicoAPI;
import br.edu.ifes.sr.poo2.api.MeuServicoAPIImpl;

public class MeuServicoTest {
	
	private MeuServicoAPI meuServicoAPI;
	
	@Before
	public void before(){
		meuServicoAPI = new MeuServicoAPIImpl();
	}
	
	@Test
	public void isWorking(){
		
		boolean resposta = meuServicoAPI.isWorking();
		
		Assert.assertTrue(resposta);
		
	}
	
	@Test
	public void setIdGerenteTest(){
		
		meuServicoAPI.setIdGerente(99);
		
		//int idGerente = meuServicoAPI.getIdGerente();
		
		//Assert.assertEquals(99,idGerente);
		
		//int idServico = meuServicoAPI.getIdGerente();
		
		//Assert.assertEquals(-1,idServico);
		
		
	}

}
