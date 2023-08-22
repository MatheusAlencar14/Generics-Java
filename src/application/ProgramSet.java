package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {

    public static void main(String[] args) {

        //LinkedHashSet não tão rápido, mas mantém a ordem que os elementos foram inseridos.
        Set<String> set = new LinkedHashSet<>();

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
