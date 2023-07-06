package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo {
    public static void main(String[] args) {


        // Stream = Fluxo de dados.

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Comparando lambda");
            }
        }).start();


        new Thread(() ->System.out.println("Ola mundo.")).start();

        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        lista.stream()
                .filter(lista1 -> lista1 % 2 == 0)
                .forEach(lista1 -> System.out.println(lista1));
    }
}
