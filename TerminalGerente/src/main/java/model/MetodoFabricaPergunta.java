package model;

import br.edu.ifes.sr.poo2.api.model.PerguntaTerceiro;



public class MetodoFabricaPergunta {

	public static PerguntaTerceiro getInstance(String nivel) {
		
		if(nivel.equals("FACIL")){
			
			return PerguntaFacil.criarPergunta();
			
		}else if(nivel.equals("MEDIO")){
			
			return PerguntaMedio.criarPergunta();
				
		}else{
			
			return PerguntaDificil.criarPergunta();
		}
		
	}

}
