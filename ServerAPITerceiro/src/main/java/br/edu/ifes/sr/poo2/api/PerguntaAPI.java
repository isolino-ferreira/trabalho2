package br.edu.ifes.sr.poo2.api;

import br.edu.ifes.sr.poo2.api.generic.APITerceiro;
import br.edu.ifes.sr.poo2.api.model.PerguntaTerceiro;

public interface PerguntaAPI extends APITerceiro<PerguntaTerceiro> {

	public String delete(int i);
}
