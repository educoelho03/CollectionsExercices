package Streams;

import java.util.Arrays;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {
        // Stream = Fluxo de dados
        List<Integer> lista = Arrays.asList(1,3,8,3,2,6,4,4,0,5,2);

        lista.stream()
                .skip(2) // Pula os dois primeiros indices. - OPERAÇÕES INTERMEDIARIAS
                .limit(6)
                .distinct() //Não permite elementos duplicados, utiliza o equals e o hashcode
                .forEach(System.out::print);


        lista.stream()
                .map(e -> e * 2) // O map consiste em uma trasnsf
                .filter(e -> e % 2 == 0) // filtragem personalizada
                .forEach(System.out::print);
    }
}
