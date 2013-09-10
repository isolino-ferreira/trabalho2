package br.edu.ifes.sr.poo2.api.model;

import java.util.ArrayList;
import java.util.List;

public class JogoTerceiro {

	private int idJogo;
	
	private String username;
	
	List<PerguntaTerceiro> perguntas = new ArrayList<PerguntaTerceiro>();

	public void add(PerguntaTerceiro pergunta)
	{
		this.perguntas.add(pergunta);
	}

	public int getIdJogo() {
		return idJogo;
	}

	public void setIdJogo(int idJogo) {
		this.idJogo = idJogo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<PerguntaTerceiro> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<PerguntaTerceiro> perguntas) {
		this.perguntas = perguntas;
	}
	
	
}
