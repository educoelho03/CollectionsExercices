package Streams;

import org.junit.jupiter.api.Test;
import support.DevTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise5 extends DevTest {
    /**
     * EXERCÍCIO 5 - MAP
     */
    @Test
    public void test5() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números da lista multiplicados por 3
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, map e forEach.

        // ... seu código ...
        listaDeNumeros.stream()
                .map(e -> e * 3)
                        .forEach(System.out::print);
        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("369121518");
    }

    private void assertEquals(List<Integer> list, List<Integer> listaDeNumeros, String testeQuebrado) {
    }
}
