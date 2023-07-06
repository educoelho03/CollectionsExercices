package Lambdas;

import org.junit.jupiter.api.Test;
import support.DevTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise6 extends DevTest {
    /**
     * EXERCÍCIO 3 - FILTER
     */
    @Test
    public void test3() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números pares da lista
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, filter e forEach.

        listaDeNumeros.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::print);

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("246");
    }
}
