package application;

import controller.TerminalGerenteController;

public class Client {
	
	public static void run() throws Exception{
		
		TerminalGerenteController terminalgerente = new TerminalGerenteController();
		
		terminalgerente.Menu();
		
	}

}
