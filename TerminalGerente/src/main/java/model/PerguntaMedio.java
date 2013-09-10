package model;

import br.edu.ifes.sr.poo2.api.model.NivelTerceiro;
import br.edu.ifes.sr.poo2.api.model.PerguntaTerceiro;

public class PerguntaMedio extends PerguntaFactory {
	
	public static PerguntaTerceiro criarPergunta() {
		
		PerguntaTerceiro p = new PerguntaTerceiro();
		
		p.setNivel(NivelTerceiro.MEDIO);
		
		p.addResposta(MetodoFabricaResposta.getInstance());
		p.addResposta(MetodoFabricaResposta.getInstance());
		p.addResposta(MetodoFabricaResposta.getInstance());
		
		//retorna uma pergunta media sem valor(texto) com tres respostas vazias
		return p;
	}
}
