package chap9.Try;

public class Try2 {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (ArrayIndexOutOfBoundsException e) {//try文中で例外が投げられ、それをキャッチできた場合、catch節の例外処理が実行される。例外処理が実行された場合、プログラムは強制終了
            //せず、以降のプログラムが実行される。
            System.out.println("usega : java Try <integer> <integer>");
        } catch (NumberFormatException e) {
            System.out.println("「error : specify integers」(エラー : 整数を指定せよ)");
        } catch (ArithmeticException e) {
            System.out.println("「error : division by zero」(エラー : 0による除算)");
        }
        // System.out.println(b);
    }
}