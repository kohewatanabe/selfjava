package chap10;

import java.util.*;
import java.util.stream.*;
public class Parallel {
    public static void main(String[] args) {
        long time = System.nanoTime();

        System.out.println(
            IntStream.range(2, 10000000).filter(
                x -> IntStream.range(2, (int)Math.sqrt(x))
                .allMatch(i -> x % i != 0)
            ).count()
        );

        System.out.println((System.nanoTime() - time) / 1.0e9 + "sec");

    }
}