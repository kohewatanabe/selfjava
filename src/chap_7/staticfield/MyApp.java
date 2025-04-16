package chap_7.staticfield;

public class MyApp {
    public final String APP_NAME;
//finalで定義すると、インスタンス変数に値を入れた後にその値を変更できなくなる。
    public MyApp(String value) {
        this.APP_NAME = value;
    }
}