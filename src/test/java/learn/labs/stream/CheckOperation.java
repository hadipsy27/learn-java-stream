package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperation {

    @Test
    void testAllMatch() {
        boolean allMatch = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .allMatch(number -> number > 0);
        System.out.println(allMatch);

    }

    @Test
    void testAnyMatch() {
        boolean anyMatch = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21).stream()
                .anyMatch(number -> number > 20);
        System.out.println(anyMatch);
    }

    @Test
    void testNoneMatch() {
        boolean noneMatch = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,21).stream()
                .noneMatch(number -> number > 100);
        System.out.println(noneMatch);
    }
}
