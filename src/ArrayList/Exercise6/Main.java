package ArrayList.Exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> jobs = new ArrayList<>();

        jobs.add("Developer");
        jobs.add("Web Designer");
        jobs.add("QA");
        jobs.add("Product Owner");
        jobs.add("Front end Developer");

        System.out.println("Lista antes da ordenação: " + jobs);

        Collections.sort(jobs); // A lista é reordenada em ordem ascendente.

        System.out.println("Lista após a ordenação: " + jobs);
    }
}
