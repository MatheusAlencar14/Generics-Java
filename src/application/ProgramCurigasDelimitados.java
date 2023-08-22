package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramCurigasDelimitados {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 3, 5, 7, 9);
        List<Double> myDoubles = Arrays.asList(17.02, 10.09, 23.12);
        List<Object> myObjects = new ArrayList<Object>();

        copy(myInts,myObjects);
        printList(myObjects);
        copy(myDoubles, myObjects);
        printList(myObjects);

    }
    
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number n : source) {
            destiny.add(n);
        }
    }

    public static void printList (List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
