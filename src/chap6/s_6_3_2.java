package chap6;

import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class s_6_3_2 {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<Integer> (List.of(1,20,30,10,60,15));

        System.out.println(ts);
        System.out.println(((TreeSet<Integer>) ts).descendingSet());
        System.out.println(((TreeSet<Integer>) ts).ceiling(15));
        System.out.println(((TreeSet<Integer>) ts).lower(15));
        System.out.println(((TreeSet<Integer>) ts).tailSet(15));
        System.out.println(((TreeSet<Integer>) ts).headSet(30, true));//ArrayListなどはメソッド使えてたのに何で使えないんだ。型とメソッドだったり、インターフェイス周り
        //の理解が不足してる。一旦と飛ばす。

    }

}
