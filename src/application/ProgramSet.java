package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {

    public static void main(String[] args) {

        //LinkedHashSet não tão rápido, mas mantém a ordem que os elementos foram inseridos.
        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Iphone");
        set.add("Monitor");
        set.add("Mouse");
        set.add("Fone");
        set.add("Smartfone");
        set.add("Óculos");
        set.add("Mochila");
        set.add("Headset");
        set.add("Colar");

        set.remove("Fone");
        set.removeIf(x -> x.length() <= 2);
        set.removeIf(x -> x.charAt(0) == 'M');
        set.removeIf(x -> x.charAt(1) == 'e');

        for (String s : set) {
            System.out.println(s);
        }
    }
}
