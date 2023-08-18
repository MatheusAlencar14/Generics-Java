package application;

import entities.PrintService;

import java.util.Scanner;

public class ProgramGenerics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.println("Quantos valores gostaria de digitar?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("Primeiro: " + ps.first());

        sc.close();
    }
}
