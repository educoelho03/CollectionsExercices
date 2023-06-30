package ArrayList.Exercise14;

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


        System.out.println("Lista antes da troca: " + c1);

        Collections.swap(c1, 1, 3);

        System.out.println("Lista depois da troca: " + c1);
    }
}
