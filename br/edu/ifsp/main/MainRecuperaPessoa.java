package br.edu.ifsp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifsp.model.Pessoa;

public class MainRecuperaPessoa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pessoaPU");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 5);
		
		System.out.println(p.getNome() + " " + p.getIdade());

	}

}
