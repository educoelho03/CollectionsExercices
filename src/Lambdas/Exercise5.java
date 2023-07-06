package Lambdas;

import org.junit.jupiter.api.Test;
import support.DevTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise5 extends DevTest {
    /**
     * EXERCÍCIO 2 - FOREACH
     */
    @Test
    public void test2() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --
        for (Integer integer : listaDeNumeros) {
            System.out.print(integer);
        }

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima os 5 números da lista no console, imitando o comportamento do 'for' acima
        // 2) imprima todos os números na mesma linha usando "System.out.print"
        // 3) utilize o método forEach da API de Streams
        // 4) passe uma função lambda como argumento para o método forEach

        listaDeNumeros.stream().forEach(e -> System.out.print(e));

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("1234512345");
    }
}
