package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void streamOperation() {
        List<String> names = List.of("Hadi", "Prasetyo", "Dika");
        Stream<String> streamNames = names.stream();
        Stream<String> streamNamesUpper =  streamNames.map(name -> name.toUpperCase());
        streamNamesUpper.forEach(System.out::println);


    }
}
