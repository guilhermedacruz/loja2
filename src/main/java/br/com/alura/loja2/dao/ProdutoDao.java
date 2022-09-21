package br.com.alura.loja2.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja2.modelo.Produtos;

public class ProdutoDao {
	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		super();
		this.em = em;
	}
	public void cadastrar (Produtos produto) {
		this.em.persist(produto);
	}
	
}
