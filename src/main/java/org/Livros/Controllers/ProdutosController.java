package org.Livros.Controllers;

import org.Livros.dao.ProdutoDAO;
import org.Livros.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {

	@Autowired
	private ProdutoDAO produtoDAO;
	
	@RequestMapping("/produtos/form")
	public String form() {
		System.out.println("Entrando na index da aplicacao");
		return "/produtos/form";
	}
	
	@RequestMapping("/produtos/gravaProduto")
	public String gravar(Produto produto) {
		produtoDAO.gravar(produto);
		System.out.println("Titulo: " + produto.getTitulo());
		System.out.println("Descricao: " + produto.getDescricao());
		System.out.println("Paginas: " + produto.getPaginas());
		return "/produtos/ok";
	}		
	
}
