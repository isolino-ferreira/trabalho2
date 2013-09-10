package controller;

import util.Leitor;
import view.ServicoView;
import br.edu.ifes.sr.poo2.api.GerenteAPI;
import br.edu.ifes.sr.poo2.api.GerenteAPIIMpl;
import br.edu.ifes.sr.poo2.api.MeuServicoAPI;
import br.edu.ifes.sr.poo2.api.MeuServicoAPIImpl;
import br.edu.ifes.sr.poo2.api.ServicoAPI;
import br.edu.ifes.sr.poo2.api.ServicoAPIIMpl;
import br.edu.ifes.sr.poo2.api.model.Servico;

public class ServicoController {
	
	ServicoAPI servicoAPI = new ServicoAPIIMpl();
	GerenteAPI gerenteAPI = new GerenteAPIIMpl();
	MeuServicoAPI meuServicoAPI = new MeuServicoAPIImpl();
	
	public Servico criarServico() throws Exception{
		
		CategoriaController categoria = new CategoriaController();
		
		Servico servico = new Servico();
		ServicoView.addURL();
		String url = Leitor.ler();
		servico.setUrl(url);
		
		servico.setGerente(gerenteAPI.get(meuServicoAPI.getIdGerente())); //add gerente no servico
		
		servico.setCategoria(categoria.criarCategoria());
		
		return servico;
		
	}
	
	public int cadastrarServico(Servico service) throws Exception{
		
		int id =0;
		try{ id = servicoAPI.adicionar(service); } catch (Exception e){ System.out.println("Erro ao criar servico\n Dica: Não deixe campos vazios");};
		return id;//Lembrar de atualizar o ID do servico no servidor terceiro
		
	}

	public void mostrarRanking() {
		// TODO Auto-generated method stub
		
		ServicoView.mostrarRanking( meuServicoAPI.getRanking() );
		
		
	}

}
