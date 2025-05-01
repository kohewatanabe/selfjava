package chap10;

import java.util.stream.*;
import java.util.*;

public class Match2 {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(2,100)
        .filter(x -> IntStream.rangeClosed(2, x - 1)
        .allMatch(i -> x % i != 0)//ラムダ式の中にラムダ式を書いているから、内側のラムダ式から外側のラムダ式の変数を参照できる。
        ).boxed().collect(Collectors.toList());

        System.out.println(list);
    }
}