package chap11;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FutureSeq {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {//3つの非同期処理を連結できる。1つ目の非同期処理の結果を2つ目の非同期処理の入力として渡せる。
            Random r = new Random();
            Integer num = r.nextInt(5000);
            heavy(2000);
            System.out.printf("処理1: %d\n", num);
            return num;
        })
        .thenApplyAsync(data -> {
            Integer result = data * 2;
            heavy(2000);
            System.out.printf("処理2: %d\n", result);
            return result;
        })
        .thenAcceptAsync(data -> {
            Integer num = data * 2;
            heavy(2000);
            System.out.printf("処理3: %d\n", num);
        });
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