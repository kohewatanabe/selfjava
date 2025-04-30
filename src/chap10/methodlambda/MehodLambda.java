package chap10.methodlambda;

import java.util.function.Consumer;

public class MehodLambda {
    public void walkArray(String[] data, Consumer<String> output) {//関数型インターフェイスを実装したクラスのインスタンスを引数に取る。
        for (String value :data) {
            output.accept(value);
        }
    }
}