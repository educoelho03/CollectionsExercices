package Streams;

import org.junit.jupiter.api.Test;
import support.DevTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise6 extends DevTest {
    /**
     * EXERCÍCIO 6 - SKIP, LIMIT, MAP
     */
    @Test
    public void test6() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números 3 e 4 da lista, multiplicados por 2
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, skip, limit, map e forEach.

        // ... seu código ...

        listaDeNumeros.stream().skip(2)
                .limit(2)
                .map(e -> e * 2)
                        .forEach(System.out::print);
        // -- then --
        assertConsoleContains("68");
    }

}
