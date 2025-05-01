package chap10;

import java.util.stream.*;

public class Sum {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1,10).sum());//終端操作でソースの合計値を計算して返す。
    }
}