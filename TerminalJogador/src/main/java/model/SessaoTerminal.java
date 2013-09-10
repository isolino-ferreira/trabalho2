package model;

public class SessaoTerminal {

	private static String URLservidorTerceiro;
	private static String username;

	public static void setURLServidorTerceiro(String URL){
		URLservidorTerceiro = URL;
	}
	
	public static String getURLServidorTerceiro(){
		return URLservidorTerceiro;
	}
	
	public static void setUsername(String user){
		username = user;
	}
	
	public static String getUsername(){
		return username;
	}



}
