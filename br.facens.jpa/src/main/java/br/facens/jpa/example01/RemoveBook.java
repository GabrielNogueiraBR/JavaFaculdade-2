package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveBook {
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        EntityManager eManager = factory.createEntityManager();
        Book book = eManager.find(Book.class, 1l);

        if(book != null){
            eManager.remove(book);
        }
        else{
            System.out.println("Book not found");
        }

        eManager.getTransaction().begin();
        eManager.getTransaction().commit();

        eManager.close();
        factory.close();
    }
}
