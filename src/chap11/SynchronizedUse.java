package chap11;

public class SynchronizedUse {
    
    private int value = 0;

    public void increment() {
        synchronized(this) {//tb(SynchronizedUseクラスのインスタンス)に関連付けられたロックを持っているスレッドだけが内部処理を実行できる。
            this.value ++;
        }
    }

    public static void main(String[] args) {
        final int TASK_NUM = 10000;
        Thread[] th = new Thread[TASK_NUM];
        SynchronizedUse tb = new SynchronizedUse();

        for (int i = 0; i < TASK_NUM; i++) {
            th[i] = new Thread(() -> {
                tb.increment();
            });
            th[i].start();//synchronizedブロック内の処理を実行しようとすると、1つだけロックが配られる。このロックを獲得できたスレッドがそのタイミングで内部処理を実行できる。
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