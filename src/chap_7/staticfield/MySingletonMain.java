package chap_7.staticfield;

public class MySingletonMain {
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance();

        singleton.setSetting("dark mode");
        MySingleton singleton2 = MySingleton.getInstance();//singletonと同じインスタンスを渡している。
        //このようにクラス内で1つのインスタンスしかつくることを許さない設計をシングルトン設計という。
        System.out.println(singleton.getSetting());
    }
}