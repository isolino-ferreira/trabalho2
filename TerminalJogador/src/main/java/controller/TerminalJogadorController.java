package controller;

import model.SessaoTerminal;
import br.edu.ifes.sr.poo2.api.model.Jogador;
import br.edu.ifes.sr.poo2.api.model.Jogo;
import br.edu.ifes.sr.poo2.api.model.Servico;
import util.Leitor;
import view.TerminalJogadorView;

public class TerminalJogadorController {

	public void Menu() throws Exception {

		JogadorController jogadorController = new JogadorController();
		String opcao=" ";
		
		while(!opcao.equals("0")){
			
			TerminalJogadorView.menuJogador();
			opcao = Leitor.ler();
			
			switch(opcao){
			
			case("1"):
				
				Jogador jogador = jogadorController.criarJogador();
				
				jogadorController.cadastrarJogador(jogador);
				
				break;
			
			case("2"):
				
				String username = jogadorController.login();
				
				SessaoTerminal.setUsername(username);
				
				if (!SessaoTerminal.getUsername().equals("")) {
					
					String opcaoLogado = "";
					
					ServicoController servicoController = new ServicoController();
					JogoController jogoController = new JogoController();
					RankingController rankingController = new RankingController();
					
					while(!opcaoLogado.equals("0")){
						
						TerminalJogadorView.menuJogadorLogado();
						opcaoLogado = Leitor.ler();
						
						switch(opcaoLogado){
						
						case("1"):
							
							Servico s = servicoController.escolherServico();
							
							if (s!=null)
								SessaoTerminal.setURLServidorTerceiro(s.getUrl());
							else
								break;
							
								
							Jogo jogo = jogoController.criarJogo();
							
							if (jogo == null)
								break;
							
							Jogo jogoJogado = jogoController.jogar(jogo);
							
							jogoController.corrigir(jogoJogado);
							
							break;
							
						case("2"):
							
							rankingController.mostarRanking();
							
							break;
						
						case("0"):
							TerminalJogadorView.saindoJogadorLogado();
							break;
						
						default:
							System.out.println("Opcao invalida");
							break;
						
						
						}
						
					}
					
				}
				break;
				
				
			case("0"):
				break;
			
			default:
				System.out.println("Opcao invalida");
				break;
			
			}
				
			
			
		}
	
	}

}
