package chap10;

import java.util.stream.*;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1,10)
        .reduce(1, (x, y) -> x * y));//n番目のソースとn+1番目のソースの積を、ソースが空になるまで求め続ける。第一引数を単位元といい、1番目のソースとの積を最初に算出する。
    }
}