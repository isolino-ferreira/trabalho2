package br.edu.ifes.sr.poo2.api;

import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import br.edu.ifes.sr.poo2.api.generic.APIGenericTerceiro;

public class MeuServicoAPIImpl extends APIGenericTerceiro implements MeuServicoAPI {

	public MeuServicoAPIImpl(){
		
		URL +="meuservico";
		
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
	public int adicionar(Long t) throws Exception {
		// TODO Auto-generated method stub
		// grava o ID do meu serviço no meu servidor, util para quando eu for informar O Ponto ao servidor central., não me retorna nada
		throw new Exception("não implementado");
	}

	@Override
	public Long get(int i) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("não implementado");
	}

	@Override
	public List<Long> getAll() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("não implementado");
	}


	@Override
	public void setIdGerente(int id) {
		// TODO Auto-generated method stub
		
		clientAPIUtil.get(URL+"/setIdGerente/"+id);

	}


	@Override
	public void setIdServico(int id) {
		// TODO Auto-generated method stub
		ClientResponse response = clientAPIUtil.get(URL+"/setIdServico/"+id);
		
		@SuppressWarnings("unused")
		String resp = response.getEntity(String.class);
		
	}


	@Override
	public int getIdGerente() {
		// TODO Auto-generated method stub
		ClientResponse response = clientAPIUtil.get(URL+"/getIdGerente");
		
		String resp = response.getEntity(String.class);
		
		return Integer.parseInt(resp);
	}


	@Override
	public int getIdServico() {
		// TODO Auto-generated method stub
		ClientResponse response = clientAPIUtil.get(URL+"/getIdServico");
		
		String resp = response.getEntity(String.class);
		
		return Integer.parseInt(resp);
	}
	
	@Override
	public String getRanking() {
		// TODO Auto-generated method stub
		ClientResponse response = clientAPIUtil.get(URL+"/ranking");
		
		String resp = response.getEntity(String.class);
		
		return resp;
	}
	

}
