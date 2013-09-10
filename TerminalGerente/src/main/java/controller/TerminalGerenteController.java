package controller;


import br.edu.ifes.sr.poo2.api.MeuServicoAPIImpl;
import br.edu.ifes.sr.poo2.api.model.Gerente;
import br.edu.ifes.sr.poo2.api.model.PerguntaTerceiro;
import br.edu.ifes.sr.poo2.api.model.Servico;
import util.Leitor;
import view.TerminalGerenteLogadoView;
import view.TerminalGerenteView;

public class TerminalGerenteController {
	
	GerenteController  gerentecontroller = new GerenteController();
	ServicoController servicocontroller = new ServicoController();
	PerguntaController perguntaController = new PerguntaController();
	
	public void  Menu() throws Exception{
		
		String opcao=" ";
		
		while(!opcao.equals("0")){
			
			TerminalGerenteView.menuGerente();
			opcao = Leitor.ler();
			
			switch(opcao){
			
				case ("1"):
					
					Gerente gerente= gerentecontroller.CriarGerente();
				
					int IDgerente = gerentecontroller.cadastrarGerente(gerente);
					
					//gravar id do gerente no nosso banco de dados
					(new MeuServicoAPIImpl()).setIdGerente(IDgerente);
					
					System.out.println(IDgerente);
					
					break;
					
				case("2"):
					
					boolean logado = gerentecontroller.login();
					if(logado){
						
						String opcaoLogado=" ";
						while(!opcaoLogado.equals("0")){
							
							TerminalGerenteLogadoView.menuGerenteLogado();
							opcaoLogado = Leitor.ler();
							
							switch(opcaoLogado){
							
								case("1"):
									
									//cadastrar servico
									Servico servico = servicocontroller.criarServico();
								
									int idServico = servicocontroller.cadastrarServico(servico);
									
									(new MeuServicoAPIImpl()).setIdServico(idServico);
									
									break;
									
								case("2"):
									//cadastrar perguntas e respostas
								
									PerguntaTerceiro p = perguntaController.criarPergunta();
									
									perguntaController.preencher(p);
									
									perguntaController.cadastrar(p);
									
									break;
									
								case("3"):
									//excluir pergunta
									
									//--listar perguntas que podem ser excluidas, escolher pergunta
									perguntaController.deletar();
									
									break;
									
								case("4"):

									servicocontroller.mostrarRanking();
									
									break;
									
								case("0"):
									
									System.out.println("o/---------------------------FAZENDO LOG OFF--------------------------------\\o");
									break;
									
								default:
									
									System.out.println("Opcao invalida");
									break;
							}
						}
						
					}
					else{
						System.out.println("Login ou senha incorreto");
					}
					break;
				
				case("0"):
					System.out.println("o/---------------------------SAINDO DO TERMINAL GERENTE--------------------------------\\o");
					break;
				default:			
						System.out.println("Opcao invalida");
						break;
			}
		}
	}
}	
