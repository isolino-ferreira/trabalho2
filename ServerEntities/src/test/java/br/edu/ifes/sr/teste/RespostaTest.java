package br.edu.ifes.sr.teste;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifes.sr.poo2.model.RespostaImpl;
import br.edu.ifes.sr.poo2.repository.RespostaRepository;

public class RespostaTest extends AbstractTest {
	
	@Autowired
	RespostaRepository respostaRepos;
	
	private RespostaImpl resposta;
	
	@Before
	public void before(){
		this.resposta = new RespostaImpl();
	}
	
	@Test
	public void testSave(){
		
		resposta = new RespostaImpl();
		resposta.setResposta("Turquia");
		resposta.setVerdadeiro(false);
		
		respostaRepos.save(resposta);
		
		Assert.assertNotNull(respostaRepos.findOne(resposta.getId()));
	}
	
	@Test
	public void testFind(){
		
		respostaRepos.count();
		resposta = new RespostaImpl();
		resposta.setResposta("Turquia");
		resposta.setVerdadeiro(true);
		
		respostaRepos.save(resposta);
		
		List<RespostaImpl> r = respostaRepos.findAll();
		
		Assert.assertEquals(1, r.size());
		Assert.assertEquals(r.get(0).getResposta(), "Turquia");
	}
	
	@Test
	public void testDelete(){
		
		resposta = new RespostaImpl();
		resposta.setResposta("Brasil");
		
		respostaRepos.save(resposta);
		
		Assert.assertNotNull(respostaRepos.findOne(resposta.getId()));
		
		respostaRepos.delete(resposta.getId());
		
		Assert.assertNull(respostaRepos.findOne(resposta.getId()));
			
	}
	
	@Test
	public void testDeleteAll(){
		
		resposta = new RespostaImpl();
		resposta.setResposta("Brasil");
		
		respostaRepos.save(resposta);
		
		Assert.assertNotNull(respostaRepos.findOne(resposta.getId()));
		
		RespostaImpl r2 = new RespostaImpl();
		
		r2.setResposta("India");
		
		respostaRepos.save(r2);
		
		Assert.assertNotNull(respostaRepos.findOne(r2.getId()));
		
		respostaRepos.deleteAll();
		
		Assert.assertEquals(0,respostaRepos.findAll().size());
			
	}

}
