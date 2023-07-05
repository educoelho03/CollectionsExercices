package Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    private Integer Id;
    private String name;

    public Exercise3(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + ", nome: " + getName();
    }

    public static void main(String[] args) {
        Exercise3 item = new Exercise3(1,"Sabão");
        Exercise3 item2 = new Exercise3(2,"Mouse");
        Exercise3 item3 = new Exercise3(3,"Monitor");
        Exercise3 item4 = new Exercise3(4,"Teclado");

        List<Exercise3> itens = new ArrayList<>();

        itens.add(item);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);


        System.out.println("Sort by id");
        itens.sort((i1, i2) -> Integer.compare(i1.getId(), i2.getId()));

        itens.forEach(i -> System.out.println(i));

        System.out.println("\nSort by name");

        itens.sort((i1, i2) -> i1.getName().compareTo(i2.getName()));
        itens.forEach(i -> System.out.println(i));
    }
}

