package Lambdas;

import java.util.LinkedList;

public class Exercise1 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");


        l_list.forEach(item -> System.out.println(item)); // diz que para cada item o item será impresso.
    }
}
