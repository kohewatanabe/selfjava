package chap11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
// import java.util.concurrent.ExecutionException;

public class ThreadCollableBasic {
    public static void main(String[] args) {
        ExecutorService exe = Executors.newSingleThreadScheduledExecutor();
            Future<Integer> r1 = exe.submit(new ThreadCollable());//Callableインターフェイスを実装したThreadCollableクラスのインスタンスの返り値はIntegerだが、submitにそれを渡して
            Future<Integer> r2 = exe.submit(new ThreadCollable());//スレッドとしての返り値をメインスレッドに返す時はFuture<ThreadCollableクラスのインスタンスの返り値>型となって出力。
            Future<Integer> r3 = exe.submit(new ThreadCollable());
        

        try {
            System.out.println("r1 : " + r1.get());//Future<ThreadCollableクラスのインスタンスの返り値>型の値から、ThreadCollableクラスのインスタンスの返り値を取り出すにはgetメソッドが必用。
            System.out.println("r2 : " + r2.get());
            System.out.println("r3 : " + r3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        exe.close();
    }
}