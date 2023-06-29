package ArrayList.Exercise4;

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

        System.out.println(cores.get(3)); // Pega um elemento de uma determinada posição
    }
}
