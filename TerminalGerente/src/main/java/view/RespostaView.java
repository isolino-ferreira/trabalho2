package view;

import java.util.List;

import br.edu.ifes.sr.poo2.api.model.RespostaTerceiro;

public class RespostaView {
	public static void addValor(){
		System.out.println("Adicione o texto da resposta");
	}
	
	public static void setCorreta(){
		System.out.println("Digite o numero da resposta correta");
	}

	public static void mostrarValores(List<RespostaTerceiro> respostas) {
		// TODO Auto-generated method stub
		int i = 0;
		for (RespostaTerceiro r : respostas) {
			
			i++;
			
			System.out.println(i+"_"+r.getResposta());
			
		}
		
	}

	public static void erro() {
		// TODO Auto-generated method stub
		System.out.println("ERRO:  opção inválida");
	}
}
