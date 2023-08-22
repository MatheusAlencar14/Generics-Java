package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet2 {

    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8, 10, 12));
        Set<Integer> b = new TreeSet<>(Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10));

        //União: Todos os número contidos nas listas
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Intersecção: Somente os números contidos em ambas as listas
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Diferença: Os número que existem no conjunto A, mas não no B
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
