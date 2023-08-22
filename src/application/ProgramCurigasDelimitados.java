package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramCurigasDelimitados {

    public static void main(String[] args) {

        List<Object> objList = new ArrayList<Object>();
        objList.add("Matheus");
        objList.add("Maria");

        List<? super Number> list = objList;

        list.add(10);
        list.add(17.02);

        //Com 'super' não é possível dar um get na lista
        //Number x = list.get(0);  (acontece um erro)
    }
}
