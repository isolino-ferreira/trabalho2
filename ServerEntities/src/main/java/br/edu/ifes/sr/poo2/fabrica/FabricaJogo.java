package br.edu.ifes.sr.poo2.fabrica;

import java.util.List;
import java.util.Random;

//import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifes.sr.poo2.model.JogoTerceiro;
import br.edu.ifes.sr.poo2.model.JogoImpl;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;
//import br.edu.ifes.sr.poo2.service.PerguntaService;

public abstract class FabricaJogo {
	
	protected static Random random = new Random();
	
	
	//protected static PerguntaService perguntaService = new PerguntaService() ;
	
	public static JogoTerceiro criar(List<PerguntaImpl> perguntas){
		
		JogoTerceiro j = new JogoImpl();
		
		int tam = perguntas.size();
		
		if (tam>5) {
			
			for (int i = 0; i<5 ; i++){
				
				int aleatorio = random.nextInt( perguntas.size());
				
				j.addPergunta(perguntas.get(aleatorio));
				
				perguntas.remove(aleatorio);
				
			}
		}else{
			j.setPerguntas(perguntas);
		}
		
		return j;
	}
	
}
