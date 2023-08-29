package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProgramExercicioMap {

    public static void main(String[] args) {

        Map<String, Integer> votos = new TreeMap<>();

        System.out.print("Digite o local do arquivo: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int quantity = Integer.parseInt(fields[1]);
                 if (votos.containsKey(name)) {
                     int voto = votos.get(name);
                     votos.put(name, voto + quantity);
                 } else {
                     votos.put(name, quantity);
                 }
                line = br.readLine();
            }

            for (String s : votos.keySet()) {
                System.out.println(s + ": " + votos.get(s));
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
