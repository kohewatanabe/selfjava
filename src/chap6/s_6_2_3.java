package chap6;

import java.util.ArrayList;
import java.util.List;

public class s_6_2_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(10, 15, 30));
        List<Integer> list2 = new ArrayList<Integer>(List.of(60, 90));

        list.remove(0);
        list.set(1, 20);
        list.addAll(2, list2);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

}
