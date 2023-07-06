package Streams;

import org.junit.jupiter.api.Test;
import support.DevTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise4 extends DevTest {
    /**
     * EXERCÍCIO 4 - FILTER
     */
    @Test
    public void test4() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números ímpares da lista
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, filter e forEach.

        // ... seu código ...
            listaDeNumeros.stream()
                    .filter(e -> e % 2 == 1)
                            .forEach(System.out::print);

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("1357");
    }
}
