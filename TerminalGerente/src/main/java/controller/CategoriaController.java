package controller;

import util.Leitor;
import view.CategoriaView;
import br.edu.ifes.sr.poo2.api.model.Categoria;

public class CategoriaController {
	Categoria categoria = new Categoria();
	
	public Categoria criarCategoria(){
		
		CategoriaView.addNome();
		String nome = Leitor.ler();
		CategoriaView.addDescricao();
		String descricao = Leitor.ler();
		
		categoria.setNome(nome);
		categoria.setDescricao(descricao);
		
		return categoria;
		
	}

}
