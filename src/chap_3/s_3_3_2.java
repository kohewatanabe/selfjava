package chap_3;

public class s_3_3_2 {
    public static void main(String[] args) {
        var age = 30;
        System.out.println(age >= 20 ? "おとな" : "こども");

        String value = new String("あいう");// クラスのインスタンス化はクラス(引数)でインスタンス化。
        if (value == null) {
            System.out.println("えお");
        } else {
            System.out.println(value);
        }


    }

}