package chap10;

import java.util.stream.*;
import java.util.*;

public class Match {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(2, 100)
        .filter(x -> {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }).boxed().collect(Collectors.toList());

        System.out.println(list);
    }
}