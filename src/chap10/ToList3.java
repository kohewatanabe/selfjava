package chap10;

import java.util.*;
import java.util.stream.*;

public class ToList3 {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1,10)
        .filter(x -> x % 2 == 0 || x % 3 == 0)
        .boxed().collect(Collectors.toList());

        System.out.println(list);
    }
}