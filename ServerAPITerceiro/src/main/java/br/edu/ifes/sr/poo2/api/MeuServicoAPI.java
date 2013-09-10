package br.edu.ifes.sr.poo2.api;

import br.edu.ifes.sr.poo2.api.generic.APITerceiro;

public interface MeuServicoAPI extends APITerceiro<Long> {
	
	public void setIdGerente(int id);
	
	public void setIdServico(int id);
	
	public int getIdGerente();
	
	public int getIdServico();

	String  getRanking();

}
