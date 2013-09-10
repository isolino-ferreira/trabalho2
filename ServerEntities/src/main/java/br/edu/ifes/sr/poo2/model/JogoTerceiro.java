package br.edu.ifes.sr.poo2.model;

import java.util.List;

public interface JogoTerceiro {
	
	public void setUsername(String usename);
	
	public String getUsername();
	
	public void setPerguntas(List<PerguntaImpl> perguntas);
	
	public void addPergunta(PerguntaImpl p);
	
	public List<PerguntaImpl> getPerguntas();
	
	

}
