package ArrayList.Exercise15;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Orange");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2= new ArrayList<>();
        c2.add("Blue");
        c2.add("Grey");
        c2.add("Yellow");
        c2.add("Purple");


        ArrayList<String> a = new ArrayList<>();

        a.addAll(c1);
        a.addAll(c2);

        System.out.println("Lista unida: " + a);



    }
}
