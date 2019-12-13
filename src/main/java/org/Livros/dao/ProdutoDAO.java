package org.Livros.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.Livros.models.Produto;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoDAO {

	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Produto produto) {
		manager.persist(produto);
	}
	
}
