package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertBook {
    
    public static void main(String[] args) {
        
        // Primeiro passo: Criar um EntityManagerFactory
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        // Factory eh um padrao de projeto

        // Criar um EntityManager que GERENCIA entidades
        EntityManager eManager = factory.createEntityManager();

        // Criacao de uma entidade Book
        Book b1 = new Book();
        // b1.setId(1L);
        b1.setAuthor("Gabriel Augusto Nogueira");
        b1.setPrice(26.6);
        b1.setTitle("Como utilizar entidades");

        // Aqui estamos fazendo a persistencia do Objeto Book para a entidade atraves do eManager
        eManager.persist(b1);

        // Cria uma transacao dos dados para o banco de dados
        eManager.getTransaction().begin();
        eManager.getTransaction().commit();

        eManager.close();
        factory.close();
    }
}
