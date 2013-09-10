package br.edu.ifes.sr.teste;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifes.sr.poo2.fabrica.MetodoFabricaJogo;
import br.edu.ifes.sr.poo2.model.JogoImpl;
import br.edu.ifes.sr.poo2.model.JogoTerceiro;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;
import br.edu.ifes.sr.poo2.model.RespostaImpl;
import br.edu.ifes.sr.poo2.repository.RespostaRepository;
import br.edu.ifes.sr.poo2.service.JogoService;
import br.edu.ifes.sr.poo2.service.PerguntaService;

public class JogoTest extends AbstractTest {
	
	@Autowired
	private JogoService service;
	
	@Autowired
	private PerguntaService serviceP;
	
	@Autowired
	private RespostaRepository reposR;
	
	@Test
	public void salvar(){
		
		
		
		PerguntaImpl p = new PerguntaImpl();
		
		p.setValor("oi oi oi ");
		
		serviceP.save(p);
	
		RespostaImpl r = new RespostaImpl();
		r.setResposta(" r r r ");
		
		reposR.save(r);
		
		p.addResposta(r);
		
		serviceP.save(p);
	
		
		List<PerguntaImpl> perg = serviceP.findAll();
		
		JogoTerceiro j =  MetodoFabricaJogo.getInstance(perg);
		
		j.setUsername("isolino");
		
		
		service.save((JogoImpl)j);
		
		Assert.assertNotSame(0,((JogoImpl)j).getId());
		
		System.out.println(((JogoImpl)j).getId());
		
	}

}
