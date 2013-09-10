package br.edu.ifes.sr.teste;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifes.sr.poo2.model.NivelTerceiro;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;
import br.edu.ifes.sr.poo2.model.RespostaImpl;
import br.edu.ifes.sr.poo2.repository.PerguntaRepository;
import br.edu.ifes.sr.poo2.repository.RespostaRepository;
import br.edu.ifes.sr.poo2.service.PerguntaService;

public class PerguntaTest extends AbstractTest {

	@Autowired
	PerguntaRepository perguntaRepos;
	
	@Autowired
	RespostaRepository rr;
	
	private PerguntaImpl pergunta;
	
	@Before
	public void before(){
		this.pergunta = new PerguntaImpl();
	}	
	
	@Test
	public void saveTest(){
		pergunta = new PerguntaImpl();
		pergunta.setValor("Qual a capital do Brasil?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		
		//Assert.assertSame(pergunta.getId(),0);//não entendi
		
		perguntaRepos.save(pergunta);
		
		Assert.assertNotSame(pergunta.getId(),0);//não entendi pq passa no teste mesmo se não for salvo
		
		Assert.assertNotNull(perguntaRepos.findOne(pergunta.getId()));
	}
	
	@Test
	public void findTest(){
		
		pergunta = new PerguntaImpl();
		pergunta.setValor("Qual a capital do Brasil?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		
		perguntaRepos.save(pergunta);
		
		List<PerguntaImpl> x = perguntaRepos.findByNivel(NivelTerceiro.FACIL);
		
		Assert.assertNotNull(x);
		
		Assert.assertEquals("Qual a capital do Brasil?", x.get(0).getValor());
		
		x = perguntaRepos.findByNivel(NivelTerceiro.DIFICIL);
		
		Assert.assertSame(0, x.size());
	}
	
	@Test
	public void deleteTest(){
		
		pergunta = new PerguntaImpl();
		pergunta.setValor("Qual a capital do Brasil");
		pergunta.setNivel(NivelTerceiro.FACIL);
		
		perguntaRepos.save(pergunta);
		
		PerguntaImpl x = perguntaRepos.findById(pergunta.getId());
		
		Assert.assertNotNull(x);
		
		perguntaRepos.delete(x);
		
		x = perguntaRepos.findById(x.getId());
		
		Assert.assertNull(x);
		
		
	}
	
	@Test
	public void deleteAllTest(){
		
		pergunta = new PerguntaImpl();
		pergunta.setValor("Qual a capital do Brasil");
		pergunta.setNivel(NivelTerceiro.FACIL);
		
		perguntaRepos.save(pergunta);
		
		pergunta = new PerguntaImpl();
		pergunta.setValor("Qual a capital do Arzebaijao");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		
		perguntaRepos.save(pergunta);
		
		List<PerguntaImpl> lp = perguntaRepos.findAll();
		
		Assert.assertSame(2, lp.size());
		
		perguntaRepos.deleteAll();
		
		lp = perguntaRepos.findAll();
		
		Assert.assertSame(0, lp.size());
		
	}
	
	@Test
	public void savePerguntaAndRespostaTest(){
		
		pergunta = new PerguntaImpl();
		pergunta.setValor("Qual a capital do Brasil?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		
		Set<RespostaImpl> opcoes = new HashSet<RespostaImpl>();
		RespostaImpl r1 = new RespostaImpl();
		r1.setResposta("Salvador");
		r1.setVerdadeiro(false);
		opcoes.add(r1);
		
		RespostaImpl r2 = new RespostaImpl();
		r2.setResposta("vila velha");
		r2.setVerdadeiro(false);
		opcoes.add(r2);
		
		RespostaImpl r3 = new RespostaImpl();
		r3.setResposta("Brasilia");
		r3.setVerdadeiro(true);
		opcoes.add(r3);
		
		pergunta.setRespostas(opcoes);
		
		perguntaRepos.save(pergunta);
		
		List<PerguntaImpl> x = perguntaRepos.findByNivel(NivelTerceiro.FACIL);
		
		Assert.assertNotNull(x);
		
		Set<RespostaImpl> r = x.get(0).getRespostas();
		
		Assert.assertNotSame(0, r.size());
		
		Assert.assertEquals(3,r.size());
		
		
	}
	
	
	public void testPerguntaImpltoPergunta(){
		
		PerguntaService service =  new PerguntaService();
		
		pergunta = new PerguntaImpl();
		pergunta.setValor("Qual a capital dO Teste?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		
		Set<RespostaImpl> opcoes = new HashSet<RespostaImpl>();
		RespostaImpl r1 = new RespostaImpl();
		r1.setResposta("Salvador");
		r1.setVerdadeiro(false);
		opcoes.add(r1);
		
		RespostaImpl r2 = new RespostaImpl();
		r2.setResposta("vila velha");
		r2.setVerdadeiro(false);
		opcoes.add(r2);
		
		RespostaImpl r3 = new RespostaImpl();
		r3.setResposta("Brasilia");
		r3.setVerdadeiro(true);
		opcoes.add(r3);
		
		pergunta.setRespostas(opcoes);

		
		perguntaRepos.save(pergunta);
		//service.save(pergunta);
		System.out.println(pergunta.getId());
		
		PerguntaImpl pergunta2 = (PerguntaImpl) service.find(pergunta.getId());
		//RespostaImpl respoIterator = pergunta.getRespostas().iterator();
		
		//Pergunta perg = new Pergunta();
		//perg.setValor(pergunta.getValor());
		System.out.println(" testPerguntaImpltoPergunta\n"+pergunta2.getValor());
		
		//Resposta r = new Resposta();
		
		Iterator<RespostaImpl> iResp = pergunta2.getRespostas().iterator();
		while(iResp.hasNext()){
			
			RespostaImpl rImpl = (RespostaImpl) iResp.next();
			//r.setId(rImpl.getId().intValue());
			System.out.println("\t"+rImpl.getId().intValue());
			//r.setResposta(rImpl.getResposta());
			//perg.add(r);
			System.out.println(" -r- "+rImpl.getResposta());
		}
	}
	
	
}
