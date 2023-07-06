package Streams;

import org.junit.jupiter.api.Test;
import support.DevTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise3 extends DevTest {
    /**
     * EXERCÍCIO 3 - DISTINCT
     */
    @Test
    public void test3() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 1, 2, 3);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 1, 2, 3), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números 1, 2 e 3 da lista, mas apenas uma vez cada
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, distinct e forEach.

        // ... seu código ...
        listaDeNumeros.stream()
                .distinct()
                .forEach(System.out::print);

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("123");
    }

    private void assertNotNull(List<Integer> listaDeNumeros, String testeQuebrado) {
    }
}
