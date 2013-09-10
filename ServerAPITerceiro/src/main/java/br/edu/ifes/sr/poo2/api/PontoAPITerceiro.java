package br.edu.ifes.sr.poo2.api;

import br.edu.ifes.sr.poo2.api.model.Ponto;


public interface PontoAPITerceiro {
	
	public Long getPonto (String username, Long idServico);
	
	public void setPonto (Ponto ponto) throws Exception;
}
