package application;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ProgramIntrodTiposCuringa {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(8, 7, 17, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Matheus", "Miguel", "Társilla");
        printList(myStrs);
    }

    //Utilizando '?' ao invés do 'Object'
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    //Não possibilidade de adicionar um novo valor nessa lista com 'list.add()'
}
