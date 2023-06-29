package ArrayList.Exercise12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> jobs = new ArrayList<String>();

        jobs.add("Developer");
        jobs.add("Web Designer");
        jobs.add("QA");
        jobs.add("Product Owner");
        jobs.add("Front end Developer");

        System.out.println("Lista normal: " + jobs);

        List<String> subList = jobs.subList(0,2);

        System.out.println("Lista formatada: " + subList);


    }
}
