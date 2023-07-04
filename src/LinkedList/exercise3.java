package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class exercise3 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");


        Iterator<String> it = l_list.listIterator(2);

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
