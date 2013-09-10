package br.edu.ifes.sr.teste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifes.sr.poo2.fabrica.MetodoFabricaJogo;
import br.edu.ifes.sr.poo2.model.JogoTerceiro;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;
import br.edu.ifes.sr.poo2.repository.PerguntaRepository;

public class FabricaPerguntaTest {

	@Autowired
	private PerguntaRepository servicePergunta;
	
	
	public void testaFabrica(){
		
		//JogoTerceiro j = MetodoFabricaJogo.getInstance("MEDIO");
		
		//Assert.assertNotNull(j);
	}
	
	@Test
	public void testarFabricaList(){
		
		List<PerguntaImpl> perguntas = new ArrayList<PerguntaImpl>();
		
		perguntas.add(new PerguntaImpl());
		perguntas.add(new PerguntaImpl());
		perguntas.add(new PerguntaImpl());
		perguntas.add(new PerguntaImpl());
		perguntas.add(new PerguntaImpl());
		perguntas.add(new PerguntaImpl());
		
		
		JogoTerceiro j = MetodoFabricaJogo.getInstance(perguntas);
		
		Assert.assertNotNull(j);
	}
	@Test
	public void testeLong(){
		
		Long board = new Long(10) + new Long(10);
		
		String a = "isolkino "+ board;
		System.out.println(a);
		
		Assert.assertEquals(20,board.intValue());
	}
}
