package br.facens.jpa.example01;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SelectAllBook {
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        EntityManager eManager = factory.createEntityManager();

        // Executando um select com JQPL
        List <Book> list = eManager.createQuery("SELECT o FROM Book o", Book.class).getResultList();

        for(Book b:list){
            System.out.println(b);
        }

        eManager.close();
        factory.close();
    }
}
