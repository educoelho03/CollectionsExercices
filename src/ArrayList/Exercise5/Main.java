package ArrayList.Exercise5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Renegade");
        cars.add("Onix");
        cars.add("Mustang");
        cars.add("Golf");
        cars.add("Porsche");

        System.out.println(cars);

        cars.set(2, "Ferrari"); // Atualiza o segundo elemento

        System.out.println(cars);

    }
}
