package application;

import controller.TerminalJogadorController;

public class Client {
	
	public static void run() throws Exception{
		TerminalJogadorController terminaljogador = new TerminalJogadorController();
		terminaljogador.Menu();
	}


}
