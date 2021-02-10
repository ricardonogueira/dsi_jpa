package br.edu.ifsp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifsp.model.Pessoa;

public class MainInserePessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Aderbal");
		p.setIdade(56);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pessoaPU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}

}
