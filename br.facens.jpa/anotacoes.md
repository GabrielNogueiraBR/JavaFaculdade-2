# Anotações da aula de Programação Orientada a objetos

## Aula 05/03/2021
    No momento que realizamos um consulta no banco de dados utilizando um EnitityManager, nós criamos uma INSTÂNCIA do objeto em nosso código, de forma que, a medida que vamos alterando este objeto, as alterações também surtem efeito na linha do nosso banco de dados.
        - `Book book = eManager.find(Book.class, 1l);`

    Outro ponto importante que vale a pena ressaltar é em relação ao seguinte código:
        - `Book book = eManager.getReference(Book.class, 2l);`
    
    Quando utilizamos o código getReference, o que estamos fazendo na prática é criar uma REFÊNCIA do objeto em nosso código, a principal diferença é que neste, não é feito um select para obter as informações do objeto no banco de dados a menos que isso seja requisitado posteriormente.
        - `Book book = eManager.getReference(Book.class, 2l);`
        - `System.out.println(book);`