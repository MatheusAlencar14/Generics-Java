package application;

import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProgramProduct {

    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contém a chave 'ps': " + stock.containsKey(ps));
        System.out.println(stock.size());
        System.out.println(stock.get(p1));
        System.out.println(p1.getName() + ": " + p1.getPrice() + ", quantidade: " + stock.get(p1));
    }
}
