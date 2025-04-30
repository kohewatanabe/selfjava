package chap10;

import java.util.ArrayList;
import java.util.List;

public class CollReplace {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
            List.of("バラ", "チューリップ", "あさがお")
        );
        list.replaceAll(v -> {//replaceAllメソッドによってlistの各要素がラムダ関数の引数に渡されて、その返り値が元のlistの引数を渡したインデックスに入る(破壊型メソッド)。
            if (v.length() < 3) {
                return v;
            } else {
                return v.substring(0, 3);
            }
        });
        System.out.println(list);
    }
}