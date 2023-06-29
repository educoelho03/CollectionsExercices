package ArrayList.Exercise11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();
        cars.add("Renegade");
        cars.add("Onix");
        cars.add("Mustang");
        cars.add("Golf");
        cars.add("Porsche");


        System.out.println("Lista normal: " + cars);

        Collections.reverse(cars);

        System.out.println("Lista reversa: " + cars);
    }
}
