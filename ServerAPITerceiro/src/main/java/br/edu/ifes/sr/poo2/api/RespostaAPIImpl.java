package br.edu.ifes.sr.poo2.api;

import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import br.edu.ifes.sr.poo2.api.generic.APIGenericTerceiro;
import br.edu.ifes.sr.poo2.api.model.RespostaTerceiro;

public class RespostaAPIImpl extends APIGenericTerceiro implements RespostaAPI {

	public RespostaAPIImpl(){
		URL +="/resposta";
	}
	@Override
	public boolean isWorking() {
		// TODO Auto-generated method stub
		ClientResponse response = clientAPIUtil.get(URL+"/isWorking");
		
		String retorno = response.getEntity(String.class);
		
		if (retorno.equals("is Working")) return true;
		
		return false;
		
	}

	@Override
	public int adicionar(RespostaTerceiro r) throws Exception {
		// TODO Auto-generated method stub
		String respostaJSON = gson.toJson(r);
		
		ClientResponse response = clientAPIUtil.post(URL+"/add/", respostaJSON );
		
		String retorno = response.getEntity(String.class);
		
		return new Integer(retorno);
	}

	@Override
	public RespostaTerceiro get(int i) throws Exception {
		// TODO Auto-generated method stub
		
		ClientResponse response = clientAPIUtil.get(URL+"/get/"+i);
		
		String retorno = response.getEntity(String.class);
		
		RespostaTerceiro resposta = gson.fromJson(retorno, RespostaTerceiro.class);
		
		return resposta; 
	}

	@Override
	public List<RespostaTerceiro> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
