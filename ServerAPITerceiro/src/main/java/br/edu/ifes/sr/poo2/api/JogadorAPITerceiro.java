package br.edu.ifes.sr.poo2.api;

import java.util.List;

import br.edu.ifes.sr.poo2.api.generic.APITerceiro;
import br.edu.ifes.sr.poo2.api.model.Jogador;
import br.edu.ifes.sr.poo2.api.model.Ponto;

public interface JogadorAPITerceiro extends APITerceiro<Jogador> {
	
	public String login(String email, String senha) throws Exception;
	
	public List<Ponto> getRanking();
	
}
