package chap10;

import java.util.*;
import java.util.stream.*;

public class ToList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                list.add(i);
            }
        }
        
        System.out.println(list);
    }
}