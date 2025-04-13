package chap6;

import java.util.LinkedList;
import java.util.List;

public class s_6_2_2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>(List.of("うさぎ", "たつ", "へび"));
        System.out.println(list);

        list.addFirst("とら");
        list.addFirst("うま");

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);
    }

}
