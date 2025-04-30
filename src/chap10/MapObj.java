package chap10;

import java.util.*;
import java.util.stream.*;

public class MapObj {
    public static void main(String[] args) {
        List<String> list = IntStream.range(1,10)
        .mapToObj(x -> String.valueOf(x).repeat(x))//mapToObjは任意のプリミティブ型を要素に持つストリームを任意の参照型を要素に持つストリームに変換する。
        //どの参照型に変換するかどうかは、ラムダ式の返り値によって決まる。
        .collect(Collectors.toList());

        System.out.println(list);
    }
}