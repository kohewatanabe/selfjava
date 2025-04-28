package chap9.assert1;

public class Assert {
    public static boolean prime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n > 2;
    }
    static {//static初期化子はそのクラスが呼ばれると必ず実行される。
        //assert 文がスローする可能性のある AssertionError を、catch 節で捕捉して、そのままプログラムの実行を継続しようとするような例外処理は、通常は書かない。
        //AssertionError がスローされたら、それを捕捉せず、プログラムを異常終了させることで、開発者はすぐにバグの存在に気づき、原因を特定・修正する機会を得られる。
        assert !prime(1):1;
        assert prime(2):2;
        assert prime(3):3;
        assert !prime(4):4;
    }

    public static void main(String[] args) {        // try {
        //     int n = Integer.parseInt(args[0]);
        //     System.out.printf("%d %s a prime number.\n", n, prime(n) ? "is":"is not");
        // } catch(Exception e) {
        //     System.out.println("usage: java Assert <integer>");
        // }

    }
}