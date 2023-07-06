package Streams;

import org.junit.jupiter.api.Test;
import support.DevTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise2 extends DevTest {
    /**
     * EXERCÍCIO 2 - LIMIT
     */
    @Test
    public void test2() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números 1, 2 e 3 da lista.
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, limit e forEach.

        listaDeNumeros.stream()
                .limit(3)
                .forEach(System.out::print);


        // -- then --
        assertConsoleContains("123");
    }

    private void assertEquals(List<Integer> list, List<Integer> listaDeNumeros, String testeQuebrado) {
    }
}
