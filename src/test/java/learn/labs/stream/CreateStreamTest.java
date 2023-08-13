package learn.labs.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> singleStream = Stream.of("Hadi");
        singleStream.forEach(System.out::println);

        String data = "Prasetyo";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Hadi","Prasetyo","Dika");
        arrayStream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13);
        integerStream.forEach(System.out::println);

        String[] array = new String[]{
                "Hadi", "Prasetyo", "Dika"
        };
        Stream<String> streamForArray = Arrays.stream(array);
        streamForArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collectionList = List.of("Hadi", "Prasetyo", "Dika");
        Stream<String> stringStream = collectionList.stream();
        stringStream.forEach(System.out::println);

        // apabila telah selesai mengalirkan stream maka tidak bisa menggunakan stream lagi
        // jadi harus membuat ulang stream yang baru
        Stream<String> stringStream2 = collectionList.stream();
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Hadi Prasetyo");
        // stream.forEach(System.out::println); // -> Perulangan tidak terhingga sesuai dengan generate dari stream

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        iterate.forEach(System.out::println); // -> Perulangan tidak terhingga 1,2,3,4,5,6,dst.
    }
}
