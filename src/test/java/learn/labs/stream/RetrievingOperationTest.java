package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class RetrievingOperationTest {

    @Test
    void limit() {
        List.of("Hadi", "Prasetyo", "Andika", "Dika").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Hadi", "Prasetyo", "Andika", "Dika").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        // berbeda dengan filter, take while hanya mengambil data apabila kondisinya true.
        List.of("Hadi", "Prasetyo", "Andika", "Dika").stream()
                .takeWhile(name -> name.length() <= 4) // hanya mengambil data apablisa kondisinya itu true.
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Hadi", "Prasetyo", "Andika", "Dika").stream()
                .dropWhile(name -> name.length() <= 4) // ignore selama true
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> names = List.of("Hadi", "Prasetyo", "Andika", "Dika").stream()
                .findAny();

        names.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> names = List.of("Hadi", "Prasetyo", "Andika", "Dika").stream()
                .findFirst();

        names.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
