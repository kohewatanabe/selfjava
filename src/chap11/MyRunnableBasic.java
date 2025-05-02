package chap11;

public class MyRunnableBasic {
    public static void main(String[] args) {
        Thread th1 = new Thread(new MyRunner());//MyRunnerのインスタンスをThreadクラスのインスタンスはフィールドに持つ。
        Thread th2 = new Thread(new MyRunner());//Threadクラスのstartメソッドを実行すると、Threadクラスのrunメソッドが実行されるが、runメソッドの内部ロジックは、
        Thread th3 = new Thread(new MyRunner());//フィールドにRuuableインターフェイスを実装したクラスのインスタンスがあれば、そのインスタンスのrunメソッドを実行するようになっているので
        //MyRunnerで定義したrunメソッドがそのスレッドで実行される。このようにRunnableインターフェイスを実装したクラスにスレッドの処理内容を書き、それをスレッドに渡して、新たなスレッドを立てる
        //ことが多い。

        th1.start();
        th2.start();
        th3.start();
    }
}