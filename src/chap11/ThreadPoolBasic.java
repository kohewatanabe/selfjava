package chap11;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadPoolBasic {
    public static void main(String[] args) {
        try(ExecutorService es = Executors.newFixedThreadPool(10)) {//スレッドが10個存在するプールを準備。tryブロックの引数に書くことで確実にプールを閉じることが出来る。
            es.execute(new ThreadPool());
            es.execute(new ThreadPool());
            es.execute(new ThreadPool());
        } //try ブロックを抜けるときに es.shutdown() が暗黙的に呼ばれる
    }
}