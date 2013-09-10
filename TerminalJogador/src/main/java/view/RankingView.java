package view;

import java.util.List;

import br.edu.ifes.sr.poo2.api.model.Ranking;

public class RankingView {

	public static void mostrar(List<Ranking> ranking) {
		// TODO Auto-generated method stub
		System.out.println("Pontuacao >> Jogador");
		for (Ranking r: ranking){
			System.out.println(r.getValor()+"\t>> "+ r.getUsername());
		}
		System.out.println("Pontuacao >> Jogador");
	}

}
