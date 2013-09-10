package br.edu.ifes.sr.poo2.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class PerguntaImpl extends ModelTerceiro implements PerguntaTerceiro {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	private String valor;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<RespostaImpl> respostas = new HashSet<RespostaImpl>();
	
	@Column
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

	public Set<RespostaImpl> getRespostas() {
		return respostas;
	}

	public void setRespostas(Set<RespostaImpl> respotas) {
		this.respostas = respotas;
	}

	@Override
	public RespostaTerceiro getResposta() {
		// TODO Auto-generated method stub
		return (RespostaTerceiro) respostas.iterator();
	}
	
	public void addResposta(RespostaTerceiro r){
		this.respostas.add((RespostaImpl) r);
	}



	
	
	

}
