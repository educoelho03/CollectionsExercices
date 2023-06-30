package ArrayList.Exercise17;

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


        int numElementos = jobs.size();

        for(int i = 0; i < numElementos; i++){
            System.out.println(jobs.get(i));
        }

    }
}
