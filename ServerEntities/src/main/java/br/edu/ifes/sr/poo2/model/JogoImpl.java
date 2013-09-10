package br.edu.ifes.sr.poo2.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

@Entity
public class JogoImpl extends ModelTerceiro implements JogoTerceiro {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private String username;
	
	@ManyToMany(fetch = FetchType.EAGER )
	private List<PerguntaImpl> perguntas = new ArrayList<PerguntaImpl>();
	
	@Column
	private int pontos;
	
	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		this.username = username;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	@Override
	public void setPerguntas(List<PerguntaImpl> perguntas) {
		// TODO Auto-generated method stub
		
		this.perguntas = perguntas;

	}

	@Override
	public void addPergunta(PerguntaImpl p) {
		// TODO Auto-generated method stub
		this.perguntas.add(p);
		
	}

	@Override
	public List<PerguntaImpl> getPerguntas() {
		// TODO Auto-generated method stub
		return this.perguntas;
	}



	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	
	

}
