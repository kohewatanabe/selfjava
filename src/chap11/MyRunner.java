package chap11;

public class MyRunner implements Runnable {
    
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);//今いるスレッドを取得。
        }
    }
}