package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {

    public static void main(String[] args) {

        //TreeSet é mais lento, mas ordena os elementos.
        Set<String> set = new TreeSet<>();

        set.add("Televisão");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Iphone");

        System.out.println(set.contains("Iphone"));

        for (String s : set) {
            System.out.println(s);
        }
    }
}
