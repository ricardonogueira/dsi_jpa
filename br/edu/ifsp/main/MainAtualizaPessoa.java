package br.edu.ifsp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifsp.model.Pessoa;

public class MainAtualizaPessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setId(4);
		p.setIdade(21);
		p.setNome("Jose Alfredo");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pessoaPU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
	}

}
