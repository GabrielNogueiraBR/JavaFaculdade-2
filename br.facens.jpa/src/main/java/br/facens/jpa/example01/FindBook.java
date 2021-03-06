package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBook {
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        EntityManager eManager = factory.createEntityManager();

        // O GetReference cria apenas uma referencia ao objeto, assim, o getReference nao busca os valores no banco, apenas cria a referencia (NAO EXECUTA NENHUM SELECT)
        Book book = eManager.getReference(Book.class, 2l);

        // Como o getReference criou a referencia do objeto, a partir do momento que precisamos das informacoes do objeto, ai sim ele realiza o select do objeto para buscar as informacoes e printar na tela. Ate entao nao tinhamos realizado nenhum select
        System.out.println(book);



        eManager.close();
        factory.close();
    }
}
