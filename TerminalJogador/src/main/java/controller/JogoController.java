package controller;

import model.SessaoTerminal;
import util.Leitor;
import view.JogoView;
import br.edu.ifes.sr.poo2.api.JogoAPI;
import br.edu.ifes.sr.poo2.api.JogoAPIImpl;
import br.edu.ifes.sr.poo2.api.model.Jogo;
import br.edu.ifes.sr.poo2.api.model.Nivel;
import br.edu.ifes.sr.poo2.api.model.Pergunta;

public class JogoController {
	
	JogoAPI jogoAPI = new JogoAPIImpl();
	
	public Jogo criarJogo (){
		
		Nivel nivel = escolherNivel();
		
		Jogo jogo = jogoAPI.jogar(SessaoTerminal.getUsername(), SessaoTerminal.getURLServidorTerceiro(),nivel);
		
		return jogo;
	}

	public Nivel escolherNivel() {
		// TODO Auto-generated method stub
		
		String opcao = "";
		
		Nivel nivel = null;			
		
		while(!opcao.equals("0")){
			
			JogoView.escolherNivel();
			opcao = Leitor.ler();

			switch(opcao){

			case("1"):

				nivel = Nivel.FACIL;
				opcao = "0";

			break;

			case("2"):

				nivel = Nivel.MEDIO;
				opcao = "0";

			break;

			case("3"):

				nivel = Nivel.DIFICIL;
				opcao = "0";

			break;

			case("4"):
				
				nivel = Nivel.MIX;
				opcao = "0";

			break;

			default:

				JogoView.erro();

			}
		}
		
		return nivel;
	}

	public Jogo jogar(Jogo jogo) {
		// TODO Auto-generated method stub
		Jogo jogoJogado = new Jogo();
		
		jogoJogado.setUsername(SessaoTerminal.getUsername());
		
		jogoJogado.setIdJogo(jogo.getIdJogo());
		
		for (Pergunta p : jogo.getPerguntas()) {
			
			JogoView.mostraPergunta(p);
			
			Pergunta pergunta = new Pergunta();
			
			
			
			boolean ler = true;

			while(ler){

				String opcao = Leitor.ler();

				switch(opcao){

				case("1"):

					pergunta.add(p.getRespostas().get(0));
					ler = false;

				break;

				case("2"):

					pergunta.add(p.getRespostas().get(1));
					ler = false;

				break;

				case("3"):

					pergunta.add(p.getRespostas().get(2));
					ler = false;

				break;

				default:
					
					JogoView.erro();

				}				

			}
			
			pergunta.setId(p.getId());
			
			pergunta.setValor(p.getValor());
			
			jogoJogado.add(pergunta);
			
		}
		return jogoJogado;
	}

	public int corrigir(Jogo jogoJogado) {
		// TODO Auto-generated method stub
		
		int pontos = jogoAPI.salvarJogo(SessaoTerminal.getURLServidorTerceiro(), jogoJogado);
		
		JogoView.mostrarPontuacao(pontos);
			
		return pontos;
	}

}
