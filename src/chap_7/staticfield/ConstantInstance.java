package chap_7.staticfield;

public class ConstantInstance {
    public static void main(String[] args) {
        MyApp app1 = new MyApp("独習JAVA");
        System.out.println(app1.APP_NAME);
        MyApp app2 = new MyApp("Teach Yourseif JAVA");
        System.out.println(app2.APP_NAME);
    }
}