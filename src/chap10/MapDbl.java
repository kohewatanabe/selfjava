package chap10;

import java.util.*;
import java.util.stream.*;

public class MapDbl {
    public static void main(String[] args) {
        List<Double> list = IntStream.range(1,10)
        .mapToDouble(x -> Math.sqrt(x))//Int型の値をDouble型に変換する。
        .boxed().collect(Collectors.toList());

        System.out.println(list);
    }
}