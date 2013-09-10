package model;

import br.edu.ifes.sr.poo2.api.model.Gerente;

public class TerminalSingleton {
	private String ServidorCentral;
	private Gerente gerente;

	public String getServidorCentral() {
		return ServidorCentral;
	}

	public void setServidorCentral(String servidorCentral) {
		ServidorCentral = servidorCentral;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
}
