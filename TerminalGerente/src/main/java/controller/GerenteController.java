package controller;



import util.Leitor;
import view.GerenteView;
import br.edu.ifes.sr.poo2.api.GerenteAPI;
import br.edu.ifes.sr.poo2.api.GerenteAPIIMpl;
import br.edu.ifes.sr.poo2.api.model.Gerente;


public class GerenteController {
	
	GerenteAPI gerente = new GerenteAPIIMpl();
	
	public Gerente CriarGerente() throws Exception{
		
		Gerente admim = new Gerente();
		GerenteView.cadastrarEmail();
		String email = Leitor.ler();
		GerenteView.cadastrarSenha();
		String senha = Leitor.ler();
		admim.setEmail(email);
		admim.setSenha(senha);
		
		return admim;
	}
	
	public int cadastrarGerente (Gerente admim) throws Exception{
		
		int id = 0;
		
		try{
			id = gerente.adicionar(admim);
		}catch(Exception e){System.out.println("Esse gerente já existe");};
		
		return id;
		
	}
	
	public boolean login(){
	
		GerenteView.loginEmail();
		String email = Leitor.ler();
		GerenteView.loginSenha();	
		String senha = Leitor.ler();
		
		return gerente.login(email, senha);
	}
}
