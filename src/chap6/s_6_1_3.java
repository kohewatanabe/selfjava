package chap6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class s_6_1_3 {//配列→コレクション
    public static void main(String[] args) {
        String[] data = new String[] {"バラ", "ひまわり", "あさがお"};
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, data);
        list.set(0, "チューリップ");
        list.add("さくら");
        list.remove(1);
        System.out.println(list);
        System.out.println(Arrays.toString(data));
    }

}
