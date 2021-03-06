package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class updateBook {
    public static void main(String[] args) {
        
        // Primeiro passo: Criar um EntityManagerFactory
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        // Factory eh um padrao de projeto

        // Criar um EntityManager que GERENCIA entidades
        EntityManager em = factory.createEntityManager();
        Book book = em.find(Book.class,2l);

        if(book != null){
            book.setAuthor("Fernanda Cruz32");
        }
        else{
            System.out.println("Book not found");
        }

        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();
        factory.close();
    }
}
