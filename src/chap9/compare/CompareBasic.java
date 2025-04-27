package chap9.compare;

import java.util.Arrays;

public class CompareBasic {
    public static void main(String[] args) {
        Person[] data = new Person[] {
            new Person("タロウ", "マツダ"),
            new Person("リコ", "モリヤマ"),
            new Person("コウスケ", "モリタ"),
            new Person("マリコ", "モリヤ"),
            new Person("ソウシ", "ムラカミ")
        };

        Arrays.sort(data);//Arrays.sortは配列の要素型がComparableインターフェイスを実装していることを前提にしている。
        System.out.println(Arrays.toString(data));// toStringをオーバーライドしないと、クラスの完全修飾名+@+オブジェクトのハッシュコードの符号なし16進数表現が返される。

    }
}