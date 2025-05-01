package chap10;

import java.util.*;
import java.util.stream.*;

public class Parellel2 {
    public static void main(String[] args) {
        long time = System.nanoTime();

        System.out.println(
            IntStream.range(2,10000000).parallel().filter(//.parallel()以降の中間操作と終端操作が並列処理になる(.parallel()が書かれたパイプラインの)。
                x -> IntStream.rangeClosed(2, (int)Math.sqrt(x))//この例で言うと、複数の素数各々にに対してfilterメソッドとcountメソッドが別々に並列処理される。
                .allMatch(i -> x % i != 0)//streamAPIは関数型プログラミングのライブラリであり、関数型プログラミングは副作用が無い(処理によって状態を元の変更しない)設計になっているので、並列処理
                //が得意。また、中間処理による状態変化をメモリに保存せず、中間処理による結果は次の中間処理に渡すことが可能なので、メモリの逼迫の低減や、メモリへの書き込み、メモリからの読み込みの時間
                //を短縮できる。
            ).count()
        );

        System.out.println((System.nanoTime() - time) / 1.0e9 + "sec");
    }
}