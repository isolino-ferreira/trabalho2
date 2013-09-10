package br.edu.ifes.sr.poo2.api;

import br.edu.ifes.sr.poo2.api.model.Jogo;
import br.edu.ifes.sr.poo2.api.model.NivelTerceiro;

public interface JogoAPITerceiro {

	public Jogo jogar (String username, String URLServico,NivelTerceiro nivel);
	
	public int salvarJogo (String URLServico, Jogo jogo);
	
}
