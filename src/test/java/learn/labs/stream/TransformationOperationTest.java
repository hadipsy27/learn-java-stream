package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMap() {
        List.of("Hadi", "Prasetyo","Dika")
                .stream().map(name -> name.toUpperCase())
                .map(upper -> upper.length()) // Map merubah dari satu data ke data yg lain
                .forEach(length -> System.out.println(length));
    }

    @Test
    void testFlatMap() {
        List.of("Hadi", "Prasetyo","Dika")
                .stream().map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length())) // merubah dari sebuah data ke data stream yang lain, setelah itu di merge manjadi satu kesatuan yg lain
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(length -> System.out.println(length));

    }
}
