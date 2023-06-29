package ArrayList.Exercise9;

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


        List<String> carsCopy = new ArrayList<String>();

        Collections.copy(carsCopy, cars);


        System.out.println(cars);
        System.out.println(carsCopy);

    }
}
