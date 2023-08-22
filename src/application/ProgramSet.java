package application;

import java.util.HashSet;
import java.util.Set;

public class ProgramSet {

    public static void main(String[] args) {

        //HashSet é mais rápido, mas não ordena os elementos.
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Iphone");

        System.out.println(set.contains("Iphone"));

        for (String s : set) {
            System.out.println(s);
        }
    }
}
