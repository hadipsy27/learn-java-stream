package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStream() {
        // Stream yg sebenarnya jarang di gunakan
        List<String> list = List.of("Hadi", "Prasetyo", "Dika");
        Stream<String> listName = list.stream();
        Stream<String> nameUpper = listName.map(name -> name.toUpperCase());
        Stream<String> nameMr = nameUpper.map(upper -> "Mr. " + upper);
        nameMr.forEach(System.out::println);

    }

    @Test
    void testCreateStreamPipeline() {
        // Stream yang sering di gunakan oleh programmer java (Stream Pipeline)
        List<String> list = List.of("Hadi", "Prasetyo", "Dika");
        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr." + upper)
                .forEach(System.out::println);
    }
}
