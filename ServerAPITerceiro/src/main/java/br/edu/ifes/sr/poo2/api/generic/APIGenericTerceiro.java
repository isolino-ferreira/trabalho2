package br.edu.ifes.sr.poo2.api.generic;

import br.edu.ifes.sr.poo2.api.util.ClientAPIUtil;

import com.google.gson.Gson;

public abstract class APIGenericTerceiro {
	
	protected String URL = "http://isolinovictor.jelastic.websolute.net.br/rest/";
	
	protected Gson gson = new Gson();
	
	protected ClientAPIUtil clientAPIUtil = new ClientAPIUtil();

}
