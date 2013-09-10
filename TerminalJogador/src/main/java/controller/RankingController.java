package controller;

import view.RankingView;
import br.edu.ifes.sr.poo2.api.JogadorAPI;
import br.edu.ifes.sr.poo2.api.JogadorAPIIMpl;

public class RankingController {
	
	JogadorAPI rankingAPI = new JogadorAPIIMpl();// rest/jogador/getranking

	public void mostarRanking() {
		// TODO Auto-generated method stub
		RankingView.mostrar( rankingAPI.getRanking());
	}
	

}
