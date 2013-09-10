package model;

import br.edu.ifes.sr.poo2.api.model.RespostaTerceiro;

public class MetodoFabricaResposta {

	public static RespostaTerceiro getInstance() {
		
		return RespostasFactory.criar();
		
	}

}
