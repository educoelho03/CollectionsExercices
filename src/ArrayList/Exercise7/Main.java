package ArrayList.Exercise7;

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

        if(jobs.contains("Developer")){ // Verifica se a String existe na lista
            System.out.println("Elemento presente na lista.");
        } else {
            System.out.println("Elemento nao esta presente na lista.");
        }
    }
}