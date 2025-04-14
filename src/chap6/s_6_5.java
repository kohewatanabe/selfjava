package chap6;

import java.util.ArrayDeque;
import java.util.Deque;

public class s_6_5 {
    public static void main(String[] args) {
        Deque<Integer> data = new ArrayDeque<Integer>();
        data.addLast(10);
        data.addLast(15);
        data.addLast(30);

        System.out.println(data);
        System.out.println(data.removeLast());
        System.out.println(data);

        Deque<Integer> data2 = new ArrayDeque<Integer>();
        data2.addLast(10);
        data2.addLast(15);
        data2.addLast(30);

        System.out.println(data2);
        System.out.println(data2.removeFirst());
        System.out.println(data2);

        //循環型のList構造になっていて、headか、tailからしかデータを出し入れできないことがDequeの本質。tailからデータを出し入れすることをキュー、headからデータを出し入れすることをスタックという。

    }

}
