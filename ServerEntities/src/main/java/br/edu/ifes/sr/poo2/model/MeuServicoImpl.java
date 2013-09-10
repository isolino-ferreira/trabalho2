package br.edu.ifes.sr.poo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class MeuServicoImpl extends ModelTerceiro implements MeuServico {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	private int idServico;
	
	@Column
	private int idGerente;
	
	@Override
	public void setIdServico(int id) {
		// TODO Auto-generated method stub
		this.idServico = id;
	}

	@Override
	public int getIdServico() {
		// TODO Auto-generated method stub
		return this.idServico;
	}

	@Override
	public void setIdGerente(int id) {
		// TODO Auto-generated method stub
		this.idGerente = id;
	}

	@Override
	public int getIdGerente() {
		// TODO Auto-generated method stub
		return this.idGerente;
	}

}
