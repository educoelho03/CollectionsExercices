package ArrayList.Exercise18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");

        System.out.println("Tamanho antes do trimToSize(): " + nomes.size());
        System.out.println("Capacidade antes do trimToSize(): " + nomes.size());

        nomes.trimToSize();

        System.out.println("Tamanho após o trimToSize(): " + nomes.size());
        System.out.println("Capacidade após o trimToSize(): " + nomes.size());


        // O método trimToSize() é um método fornecido pela classe ArrayList em Java.
        // Sua função é reduzir a capacidade interna de um ArrayList para que corresponda exatamente ao tamanho atual da lista.
    }
}
