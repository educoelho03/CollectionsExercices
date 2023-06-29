package ArrayList.Exercise10;

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

        System.out.println("Antes de ser embaralhada: " + cars);

        Collections.shuffle(cars); // Embaralha a lista

        System.out.println("Depois de ser embaralhada: " + cars);


    }
}
