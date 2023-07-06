package Streams;

import org.junit.jupiter.api.Test;
import support.DevTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise1 extends DevTest {
    /**
     * EXERCÍCIO 1 - SKIP
     */
    @Test
    public void test1() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números 4, 5 e 6 da lista.
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, skip e forEach.

        // ... seu código ...
        listaDeNumeros.stream()
                .skip(3)
                .forEach(n -> System.out.print(n));

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("456");
    }

}
