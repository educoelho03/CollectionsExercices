package ArrayList.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<String>();
        cores.add("Red");
        cores.add("Green");
        cores.add("Orange");
        cores.add("White");
        cores.add("Black");

        cores.set(0, "Blue");

        for (String elementos: cores){
            System.out.println(elementos);
        }
    }
}
