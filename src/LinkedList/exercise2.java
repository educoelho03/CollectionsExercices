package LinkedList;

import java.util.LinkedList;

public class exercise2 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        for (String lista: l_list){
            System.out.println(lista);
        }
    }
}
