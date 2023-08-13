package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Hadi");
        builder.add("Prasetyo").add("Dika");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("Hadi")
                .add("Prasetyo")
                .add("Dika")
                .build();

        stream.forEach(System.out::println);
    }
}
