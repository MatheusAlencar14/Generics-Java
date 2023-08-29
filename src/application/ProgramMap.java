package application;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("name", "Matheus");
        cookies.put("email", "matheus@mail.com");
        cookies.put("phone", "991669070");

        cookies.remove("email");
        cookies.put("phone", "991669071");

        System.out.println("Contém a chave 'phone'? " + cookies.containsKey("phone"));
        System.out.println("Número de telefone: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Tamanho: " + cookies.size());

        System.out.println("Informações: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
