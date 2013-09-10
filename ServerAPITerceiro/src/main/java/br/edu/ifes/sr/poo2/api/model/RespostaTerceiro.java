package br.edu.ifes.sr.poo2.api.model;

public class RespostaTerceiro extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String resposta;
	
	private boolean verdadeiro;
	
	private PerguntaTerceiro pergunta;
	

	public PerguntaTerceiro getPergunta() {
		return pergunta;
	}

	public void setPergunta(PerguntaTerceiro pergunta) {
		this.pergunta = pergunta;
	}

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
