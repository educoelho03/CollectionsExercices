package ArrayList.Exercise8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> jobs = new ArrayList<>();

        jobs.add("Developer");
        jobs.add("Web Designer");
        jobs.add("QA");
        jobs.add("Product Owner");
        jobs.add("Front end Developer");

        System.out.println("Lista normal: " + jobs);

        jobs.removeAll(jobs);

        System.out.println("Lista vazia: " + jobs);

    }
}
