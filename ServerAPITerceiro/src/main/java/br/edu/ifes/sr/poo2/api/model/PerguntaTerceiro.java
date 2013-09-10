package br.edu.ifes.sr.poo2.api.model;

import java.util.ArrayList;
import java.util.List;

public class PerguntaTerceiro extends Model {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String valor;
	
	private List<RespostaTerceiro> respostas = new ArrayList<RespostaTerceiro>();

	private NivelTerceiro nivel;
	
	public NivelTerceiro getNivel() {
		return nivel;
	}

	public void setNivel(NivelTerceiro nivel) {
		this.nivel = nivel;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public List<RespostaTerceiro> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<RespostaTerceiro> respostas) {
		this.respostas = respostas;
	}
	
	public void addResposta(RespostaTerceiro r){
		this.respostas.add(r);
	}
		
	

}
