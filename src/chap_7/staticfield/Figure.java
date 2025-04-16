package chap_7.staticfield;

public class Figure {
    public double pi = 3.14;//staticで宣言すれば、クラスメソッドから呼び出せる。今はインスタンスフィールドで定義されている。ここら辺もメモリ周りを理解すれば腑に落ちそう。

    public static void getCircleArea(double r) {
        System.out.println("円の面積は" + r * r * pi);//クラスメソッドからインスタンスフィールドを参照しているので参照不可。インスタンスフィールドはインスタンスが生成される時に
        //メモリが確保される。
    }
}