package chap11;

public class MyThread extends Thread {
    @Override
    public void run() {//runメソッドはスレッド開始時のエントリーポイント。
        for(int i = 0; i < 30; i++) {
            System.out.println(this.getName() + ":" + i);
        }
    }
}