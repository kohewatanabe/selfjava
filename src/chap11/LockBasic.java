package chap11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockBasic {
    private int value = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();//lockクラスを使うことで、メソッドをまたがったロックができる。
        try {
            this.value++;
        } finally {
            lock.unlock();//lockしたままだとまずいので、絶対にunlockされるようにtry文の中に書く。
        }
    }
    public static void main(String[] args) {
        final int TASK_NUM = 10000;
        Thread[] th = new Thread[TASK_NUM];
        LockBasic tb = new LockBasic();

        for (int i = 0; i < TASK_NUM; i++) {
            th[i] = new Thread(() -> {
                tb.increment();
            });
            th[i].start();
        }

        for (int i = 0; i < TASK_NUM; i++) {

            try {
                th[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(tb.value);
    }
}