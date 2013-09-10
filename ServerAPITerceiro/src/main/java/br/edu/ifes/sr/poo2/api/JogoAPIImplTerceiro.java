package br.edu.ifes.sr.poo2.api;

import java.lang.reflect.Type;

import br.edu.ifes.sr.poo2.api.generic.APIGenericTerceiro;
import br.edu.ifes.sr.poo2.api.model.Jogo;
import br.edu.ifes.sr.poo2.api.model.NivelTerceiro;

import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.ClientResponse;

public class JogoAPIImplTerceiro extends APIGenericTerceiro implements JogoAPITerceiro {
	
	public JogoAPIImplTerceiro(){
		
		URL += "jogar";
		
	}
	
	
	public Jogo jogar(String username, String URLServico, NivelTerceiro nivel) {

		ClientResponse response = clientAPIUtil.get(URLServico+"jogar/partida/"+username+"/"+nivel);
		
		String jsonResposta = response.getEntity(String.class);
		
		Type jogoType = new TypeToken <Jogo>(){}.getType();
		
		Jogo novoJogo = gson.fromJson(jsonResposta, jogoType);
		
		return novoJogo;
	}

	public int salvarJogo(String URLServico, Jogo jogo) {
		
		String JSON = gson.toJson(jogo);
		
		System.out.println("teste "+JSON);
		
		ClientResponse response = clientAPIUtil.post(URLServico+"jogar/responder/", JSON);
		
		String retorno = response.getEntity(String.class);
		
		return Integer.parseInt(retorno);
	}

}
