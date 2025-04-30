package chap10;

import java.util.*;
import java.util.stream.*;

public class ToList2 {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1,10).boxed().collect(Collectors.toList());
        
        System.out.println(list);
    }
}