package LinkedList;

import java.util.LinkedList;

public class exercise6 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        System.out.println("Lista Encadeada: " + l_list);

        l_list.offer("Grey");

        System.out.println("Lista final: " + l_list);
    }
}
