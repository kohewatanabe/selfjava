package chap10;

import java.util.stream.*;
import java.util.*;

public class MapInt {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1,10).map(x -> x * x)
        .boxed().collect(Collectors.toList());

        System.out.println(list);

    }
}