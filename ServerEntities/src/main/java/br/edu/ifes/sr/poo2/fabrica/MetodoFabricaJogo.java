package br.edu.ifes.sr.poo2.fabrica;

import java.util.List;

import br.edu.ifes.sr.poo2.model.JogoTerceiro;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;

public class MetodoFabricaJogo {

	public static JogoTerceiro getInstance(List<PerguntaImpl> perguntas) {
		// TODO Auto-generated method stub
		return FabricaJogo.criar(perguntas);
	}
}
