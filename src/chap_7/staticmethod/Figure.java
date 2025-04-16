package chap_7.staticmethod;

public class Figure {

    // private double width;
    // private double height;

    public static double getTriangle(double width, double height) {//メソッドの中にあるのはあくまで仮引数だから、呼び出し側で渡す値のこと。だからクラス内で定義していなくても機能する。
        return width * height / 2;
    }


}
