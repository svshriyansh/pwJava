package api_annotation;

import java.lang.*;
import java.util.*;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 8, 6, 3, 7);
        Stream<Integer> streamData = list.stream();
        // long count = streamData.count();
        // System.out.println(count);
        // streamData.forEach(n -> System.out.println(n));
        // Stream<Integer> sortedData = streamData.sorted();
        // sortedData.forEach(n -> System.out.println(n));

        // Stream<Integer> mapStream = sortedData.map(n -> n * 2);
        // mapStream.forEach(n -> System.out.println(n));

        /*
         * As all method have same returm type as stream thuswe can club them all in one
         * statement as finalStream
         */

        Stream<Integer> finaStream = streamData
                .filter(n -> n % 2 == 0)// implementation given using lambda expression
                .sorted()
                .map(n -> n * 2);
        finaStream.forEach(n -> System.out.println(n));

    }
}
