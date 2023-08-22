package application;

import entities.Client;

public class ProgramEqualsHashCode {

    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); //Para comparar o conteúdo dos objetos usar equals
        System.out.println(c1 == c2); //Para comparar as referências dos objetos usar '=='
    }
}
