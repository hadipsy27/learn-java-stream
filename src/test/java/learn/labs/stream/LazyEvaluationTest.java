package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntemediateOperation() {
        List<String> names = List.of("Hadi", "Prasetyo", "Dika");

        Stream<String> upper = names.stream().map(name -> {
            System.out.println("Change " + name + " to UPPER"); // Operasi intermediate pada stream sebenarnya itu tidak di eksekusi / tidak mengalir
            return name.toUpperCase();
        });
    }

    @Test
    void testTerminalOperation() {
        // Untuk mentriger stream supaya berjalan bisa menggunakan terminal operation contohnya foreach
        List<String> names = List.of("Hadi", "Prasetyo", "Dika");

        names.stream().map(name -> {
            System.out.println("Change " + name + " to UPPER"); // Operasi intermediate pada stream sebenarnya itu tidak di eksekusi / tidak mengalir
            return name.toUpperCase();
        })
        .map(upper -> {
            System.out.println("MR. " + upper); // Operasi intermediate pada stream sebenarnya itu tidak di eksekusi / tidak mengalir
            return upper.toUpperCase();
        })
        // dengan menggunakan foreach maka dia akan mentrigger supaya stream dapat berjalan
        .forEach(upper -> {
            System.out.println(upper);
        });
    }
}
