package chap6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class s_6_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(10, 15, 30, 60));
        List<Integer> list2 =   new ArrayList<Integer>(List.of(1, 5, 3, 6));
        List<Integer> list3 = new ArrayList<Integer>(List.of(1, 2, 3));

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.contains(30));
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(30));
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));//E remove(int index) : 要素を返す。
        System.out.println(list);

        list.addAll(list2);
        System.out.println(list);
        
        list.removeAll(list3);
        System.out.println(list);

        list.set(0, 100);
        Object[] data = list.toArray();//toArray()の返り値はObject[](アップキャストなら可?多態性?らしい。)
        System.out.println(Arrays.toString(data));//Arrays.toString(配列):配列の内容を文字列にして返す。
    }
}
