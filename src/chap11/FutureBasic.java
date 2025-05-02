package chap11;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FutureBasic {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {//CompletableFutureを使うことで、メインスレッドが開始した非同期タスクの結果を元のスレッドをブロックすることなく出力できる。
            Random r = new Random();//簡単に言うと、メインスレッドとサブスレッドを非同期処理に出来る。
            Integer num = r.nextInt(1000);
            heavy(num);
            return num;
        })
            .thenAcceptAsync(result -> System.out.println(result));//サブスレッドの処理内容が終わった後に、サブスレッドが最終的に実行する実行内容がこれ。
        
        System.out.println("...任意の後処理...");
        heavy(7000);
    }

    public static void heavy(int num) {
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}