package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class exercise4 {
    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        System.out.println("Lista Encadeada: " + l_list);

        Iterator<String> it = l_list.descendingIterator();

        System.out.println("Lista invertida: ");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
