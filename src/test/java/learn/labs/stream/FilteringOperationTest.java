package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

    @Test
    void filterTest() {
        List.of("Hadi", "Prasetyo", "Andika", "Dika").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8,9,10).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Hadi", "Hadi", "Prasetyo", "Andika", "Dika", "Dika", "Hadi").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
