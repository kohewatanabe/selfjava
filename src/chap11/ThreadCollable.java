package chap11;

import java.util.Random;
import java.util.concurrent.Callable;

public class ThreadCollable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random rnd = new Random();
        Integer num = rnd.nextInt(1000);//実行されたスレッドの処理をこの時間だけ止める。
        Thread.sleep(num);
        return num;
    }
}