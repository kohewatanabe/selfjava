package chap10;

public class MethodLambdaScope {
    public static void main(String[] args) {
        int radius = 10;
        Runnable circle = () -> {
            System.out.println(Math.pow(radius, 2) * Math.PI);
        };
        circle.run();
        // radius ++;
        //ラムダ式の中から参照されている変数はfinalであることが強制され、再代入されようものならコンパイルエラーになる。
    }
}