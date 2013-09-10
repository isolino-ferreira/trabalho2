package view;

import java.util.List;

import br.edu.ifes.sr.poo2.api.ServicoAPI;
import br.edu.ifes.sr.poo2.api.model.Servico;

public class ServicoView {
	public static void listarCategorias(List<Servico> servicosCadastrados){
		System.out.println("");
		System.out.println("As categorias sao: ");
		int i=0;
		for ( Servico s : servicosCadastrados){
			
			System.out.println(i+"_"+s.getCategoria().getNome()+" ["+s.getCategoria().getDescricao()+"]");
			i++;
		}
		System.out.println("Escolha o numero de uma das categorias acima: ");
	}
	
	public static void mostrarCategorias(ServicoAPI servico) throws Exception{
		System.out.println("");
		for(int i=0;i<servico.getAll().size();i++){//Loop emcima de todas as categorias
			System.out.println(i+1+" para "+ servico.getAll().get(i).getCategoria().getNome());//Imprimi o nome na tela
		}

	}

	public static void erro() {
		// TODO Auto-generated method stub
		System.out.println("Erro ao escolher Servico/Categoria");
	}
}
