package view;

import java.util.List;

import br.edu.ifes.sr.poo2.api.model.PerguntaTerceiro;

public class PerguntaView {	
	public static void addTexto(){
		System.out.println("Digite o texto da sua pergunta");
	}
	
	public static void addNivel(){
		System.out.println("Escolha o nivel da pergunta");
		System.out.println("1_ Facil");
		System.out.println("2_ Medio");
		System.out.println("3_ Dificil");
	}

	public static void listarTodas(List<PerguntaTerceiro> all) {
		// TODO Auto-generated method stub
		int i = 0;
		for(PerguntaTerceiro p: all){
			
			System.out.println(i+"_ "+p.getValor());
			i++;
		}
		System.out.println("Escolha o numero da pergunta a deletar");
		
	}
}
