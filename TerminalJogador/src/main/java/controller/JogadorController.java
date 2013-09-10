package controller;

import util.Leitor;
import view.JogadorView;
import br.edu.ifes.sr.poo2.api.JogadorAPI;
import br.edu.ifes.sr.poo2.api.JogadorAPIIMpl;
import br.edu.ifes.sr.poo2.api.model.Jogador;

public class JogadorController {
	JogadorAPI jogador = new JogadorAPIIMpl();
	
	public Jogador criarJogador(){
		Jogador player = new Jogador();
		JogadorView.cadastrarEmail();
		String email = Leitor.ler();
		JogadorView.cadastrarSenha();
		String senha = Leitor.ler();
		JogadorView.cadastrarUsename();
		String username = Leitor.ler();
		player.setEmail(email);
		player.setSenha(senha);
		player.setUsername(username);
		
		return player;
	}
	
	public int cadastrarJogador(Jogador player) throws Exception{
		
		int id=0;
		
		try{
			
			id = jogador.adicionar(player);
			
			JogadorView.sucesso();
			
		} catch (Exception e){ System.out.println("ERRO: Jogador já existe"); }
		
		
		
		return id;
	}
	
	public String login() throws Exception{
		JogadorView.loginEmail();
		String email = Leitor.ler();
		JogadorView.loginSenha();
		String senha = Leitor.ler();
		String username="";
		try { 
			
			username = jogador.login(email, senha);
			
			JogadorView.sucesso();
			
		} catch (Exception e){ System.out.println("ERRO no login"); }
		
		
		
		return username;
	}

}
