package view;

import br.edu.ifes.sr.poo2.api.model.Pergunta;

public class JogoView {

	public static void escolherNivel() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("Escolha um nivel");
		System.out.println("");
		System.out.println("1_ Facil");
		System.out.println("2_ Medio");
		System.out.println("3_ Dificil");
		System.out.println("4_ Mix");
	}

	public static void erro() {
		// TODO Auto-generated method stub
		System.out.println("ERRO: opcao invalida");
	}

	public static void mostraPergunta(Pergunta p) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println(p.getValor());
		System.out.println("");
		System.out.println("1_ "+p.getRespostas().get(0).getResposta());
		System.out.println("2_ "+p.getRespostas().get(1).getResposta());
		System.out.println("3_ "+p.getRespostas().get(2).getResposta());
		
	}

	public static void mostrarPontuacao(int pontos) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("Jogo salvo com sucesso!\nSua pontuacao nesse jogo e de: "+ pontos +" pontos.");
	}

}
