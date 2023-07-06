package Lambdas;

import org.junit.Test;
import support.DevTest;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise4 extends DevTest {
    @Test
    public void test1() {
        // -- setup --
        final AtomicInteger soma = new AtomicInteger(0);

        final Thread minhaTreadTradicional = new Thread(new Runnable() {
            @Override
            public void run() {
                soma.incrementAndGet();
            }
        });

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) faça uma thread imitando o comportamento da thread acima
        // 2) use uma função lambda para representar o Runnable


        final Thread minhaTreadLambda = new Thread(new Runnable() {
            @Override
            public void run() {
                soma.incrementAndGet();
            }
        });

        // !!! FIM DA SUA PARTE !!!

        // -- validações do exercício --
        assertNotNull(soma, TESTE_QUEBRADO);
        assertNotNull(minhaTreadTradicional, TESTE_QUEBRADO);
        assertNotNull(minhaTreadLambda, "'minhaTreadLambda' não pode ser 'null', você deve implementá-la.");

        // -- when --
        minhaTreadTradicional.run();
        minhaTreadLambda.run();

        // -- then --
        assertEquals(2, soma.get(), "O valor final de 'soma' deve ser 2, pois deverá incrementado 2 vezes: primeiro pela thread 'minhaTreadTradicional' e depois pela 'minhaTreadLambda'.");
    }

}
