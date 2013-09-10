package controller;

import java.util.List;

import util.Leitor;
import view.ServicoView;
import br.edu.ifes.sr.poo2.api.ServicoAPI;
import br.edu.ifes.sr.poo2.api.ServicoAPIIMpl;
import br.edu.ifes.sr.poo2.api.model.Servico;

public class ServicoController {
	ServicoAPI servicoAPI = new ServicoAPIIMpl();
	
	public Servico escolherServico() throws Exception{
		Servico servico = null;
		
		List<Servico> servicosCadastrados = servicoAPI.getAll();
				
		ServicoView.listarCategorias(servicosCadastrados);
		
		int servicoEscolhido;
		
		try {
			
			servicoEscolhido = Integer.parseInt(Leitor.ler());
			
			servico = servicosCadastrados.get(servicoEscolhido);
		
		}catch(Exception e){ ServicoView.erro();}

		return servico;
	}

}
