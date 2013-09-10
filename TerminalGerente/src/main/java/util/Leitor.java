package util;

import java.util.Scanner;

public class Leitor {

	private static Scanner leitor = new Scanner(System.in);
		
	public static String ler(){
		return leitor.nextLine();
	}

}
