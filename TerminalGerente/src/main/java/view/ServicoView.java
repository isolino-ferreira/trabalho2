package view;

public class ServicoView {
	
	public static void addURL(){
		System.out.println("Digite a URL do seu servico");
	}

	public static void mostrarRanking(String r) {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo ranking");

		//gambiarra para imprimir em duas colunas
		r = r.replaceAll("\\[", " ");
		
		r = r.replaceAll("\\]", "\n");
		
		r = r.replaceAll(", ", "");
		
		r = r.replaceAll(",", "\t");
			
		System.out.println(r);
			

		System.out.println("Imprimindo ranking");
		
	}
	
	
}
