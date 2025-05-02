package chap11;

public class MyThreadBasic {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        MyThread th3 = new MyThread();

        th1.start();//thread.start()でスレッドがスタートする。
        th2.start();
        th3.start();
    }
}