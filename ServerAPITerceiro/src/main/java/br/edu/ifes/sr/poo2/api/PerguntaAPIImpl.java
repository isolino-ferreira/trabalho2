package br.edu.ifes.sr.poo2.api;

import java.lang.reflect.Type;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.ClientResponse;

import br.edu.ifes.sr.poo2.api.generic.APIGenericTerceiro;
import br.edu.ifes.sr.poo2.api.model.PerguntaTerceiro;

public class PerguntaAPIImpl extends APIGenericTerceiro implements PerguntaAPI {

	public PerguntaAPIImpl(){
		URL+="/pergunta";
	}
	@Override
	public boolean isWorking() {
		// TODO Auto-generated method stub
		ClientResponse response = clientAPIUtil.get(URL+"/isWorking");
		
		String resp = response.getEntity(String.class);
		
		if (resp.equals("is Working")) return true;
		
		return false;
	}

	@Override
	public int adicionar(PerguntaTerceiro p) throws Exception {
		// TODO Auto-generated method stub
		String perguntaJSON = gson.toJson(p);		
		
		ClientResponse response = clientAPIUtil.post(URL+"/add/", perguntaJSON);
		
		String retorno = response.getEntity(String.class);
		
		Integer id = new Integer(retorno.trim());
	
		return id;
	}

	@Override
	public PerguntaTerceiro get(int i) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("NotImplemented");
	}

	@Override
	public List<PerguntaTerceiro> getAll() throws Exception {
		// TODO Auto-generated method stub
		ClientResponse response = clientAPIUtil.get(URL+"/getall");
		
		String retorno = response.getEntity(String.class);
		
		Type arrayListPergunta = new TypeToken <List<PerguntaTerceiro>>(){}.getType();
		
		List<PerguntaTerceiro> perguntas = gson.fromJson(retorno, arrayListPergunta);
		
		return perguntas;
		
	}
	
	public String delete(int i){
		
		ClientResponse response = clientAPIUtil.get(URL+"/delete/"+i);
		
		String retorno = response.getEntity(String.class);
		
		return retorno;
		
	}

}
