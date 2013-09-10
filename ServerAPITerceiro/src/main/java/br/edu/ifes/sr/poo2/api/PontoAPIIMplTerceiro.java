package br.edu.ifes.sr.poo2.api;

import br.edu.ifes.sr.poo2.api.generic.APIGenericTerceiro;
import br.edu.ifes.sr.poo2.api.model.Jogador;
import br.edu.ifes.sr.poo2.api.model.Ponto;

import com.sun.jersey.api.client.ClientResponse;

public class PontoAPIIMplTerceiro extends APIGenericTerceiro implements PontoAPITerceiro{
	
	public PontoAPIIMplTerceiro()
	{
		URL +="/ponto";
	}
	
	public boolean isWorking() {
		
		ClientResponse response = clientAPIUtil.get(URL+"/isWorking");
		
		String resp = response.getEntity(String.class);
		
		if (resp.equals("is Working")) return true;
		
		return false;
	}

	public Jogador get(int i) throws Exception{
		throw new Exception("NotImplemented");
	}

	public Long getPonto(String username, Long idServico) {
		
		ClientResponse response = clientAPIUtil.get(URL+"/get/"+username+"/"+idServico);
		
		Long resp = response.getEntity(Long.class);
		
		return resp;
	}

	public void setPonto(Ponto ponto) throws Exception {
		
		String JSON = gson.toJson(ponto);
		
		ClientResponse response = clientAPIUtil.post(URL+"/add/", JSON);
		
		String retorno = response.getEntity(String.class);
		
		if (retorno.equals("NOK")) throw new Exception("Problem");
		
		
	}
	
	
	
	

	

}
