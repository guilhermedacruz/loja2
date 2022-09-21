package br.com.alura.loja2.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja2.dao.ProdutoDao;
import br.com.alura.loja2.modelo.Produtos;
import br.com.alura.loja2.util.JPAUtil;

public class CadastroDePoduto {

	public static void main(String[] args) {
		Produtos celular = new Produtos("Xiaomi redmi", "4 cameras", new BigDecimal("800"));		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(em);
		
		
		em.getTransaction().begin();
		em.persist(celular);
		em.getTransaction().commit();
		em.close();
	}

}
