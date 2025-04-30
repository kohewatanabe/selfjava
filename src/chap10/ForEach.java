package chap10;

import java.util.stream.*;

public class ForEach {
    public static void main(String[] args) {
        IntStream.range(1,10).filter(x -> x % 2 == 0 || x % 3 == 0)
        .forEach(x -> System.out.print(x + " "));//forEachは終端操作。

        System.out.println();
    }
}