package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {
    @Test
    void testPeekBefore() {
        List.of("John", "Doe").stream()
            .map( name -> {
                    System.out.println("Before Upper name " + name);
                    String upper = name.toUpperCase();
                    System.out.println("After Upper name " + upper);
                    return upper;
                }
            ).forEach(System.out::println);
    }

    @Test
    void testPeekBAfter() {
        List.of("John", "Doe").stream()
                .peek(name -> System.out.println("Before Upper name " + name))
                .map( name -> name.toUpperCase())
                .peek(upper -> System.out.println("After Upper name " + upper))
                .forEach(name -> System.out.println("Final name " + name));
    }
}
