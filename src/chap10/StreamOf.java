package chap10;

import java.util.*;
import java.util.stream.*;

public class StreamOf {
    public static void main(String[] args) {
        List<String> list = Stream.of("apple", "banana", "coconut")//Streamインターフェイスのofメソッドは引数を要素としたストリームを生成できる。ofメソッドは
        //ストリーム・パイプラインのソースに分類される。
        .map(x -> x + ":" + x.length()).collect(Collectors.toList());

        System.out.println(list);
    }
}