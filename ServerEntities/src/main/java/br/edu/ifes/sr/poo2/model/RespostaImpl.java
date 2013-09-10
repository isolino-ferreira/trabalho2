package br.edu.ifes.sr.poo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class RespostaImpl extends ModelTerceiro implements RespostaTerceiro {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	@Column
	private String resposta;
	
	@Column
	private boolean verdadeiro;

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String valor) {
		this.resposta = valor;
	}

	public boolean isVerdadeiro() {
		return verdadeiro;
	}

	public void setVerdadeiro(boolean verdadeiro) {
		this.verdadeiro = verdadeiro;
	}
	

}
