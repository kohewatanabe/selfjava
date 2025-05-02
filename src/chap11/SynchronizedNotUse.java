package chap11;

public class SynchronizedNotUse {
    
    private int value = 0;

    public void increment() {
        this.value ++;
    }

    public static void main(String[] args) {
        final int TASK_NUM = 10000;
        Thread[] th = new Thread[TASK_NUM];
        SynchronizedNotUse tb = new SynchronizedNotUse();

        for (int i = 0; i < TASK_NUM; i++) {
            th[i] = new Thread(() -> {
                tb.increment();
            });
            th[i].start();//このラムダ式はRunnableインターフェイスを実装したクラスの動的インスタンスのrunメソッドから参照される。
        }//複数のスレッドが割り込み合って(同一メモリ上の同じデータにアクセスして)、incrementの結果が期待通りにならないことがある。

        for (int i = 0; i < TASK_NUM; i++) {//全てのスレッドが終わるまで、mainメソッドの後続の処理を待機させる。そうすることで、全てのスレッドが終わり切らないうちにmainメソッドの次の処理に
            //進むのを防ぐことが出来る。
            try {
                th[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(tb.value);
    }
}