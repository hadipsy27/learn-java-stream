package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    void testSorted() {
        List.of("Hadi", "Prasetyo", "Dika").stream()
                .sorted()
                .forEach(System.out::println);

    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        List.of("Hadi", "Prasetyo", "Dika").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
