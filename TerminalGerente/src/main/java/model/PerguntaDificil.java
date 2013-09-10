package model;

import br.edu.ifes.sr.poo2.api.model.NivelTerceiro;
import br.edu.ifes.sr.poo2.api.model.PerguntaTerceiro;

public class PerguntaDificil extends PerguntaFactory {

	public static PerguntaTerceiro criarPergunta() {
		
		PerguntaTerceiro p = new PerguntaTerceiro();
		
		p.setNivel(NivelTerceiro.DIFICIL);
		
		p.addResposta(MetodoFabricaResposta.getInstance());
		p.addResposta(MetodoFabricaResposta.getInstance());
		p.addResposta(MetodoFabricaResposta.getInstance());
		
		//retorna uma pergunta dificil sem valor(texto) com tres respostas vazias
		return p;
	}
}
