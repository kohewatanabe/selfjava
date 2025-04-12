package chap_3;

public class s_3_4 {
    public static void main(String[] args) {
        String str = null;

        if (str != null && str.startsWith(("https://"))) {
            System.out.println("「https://~」ではじまります。");// エラーが出てしまうと途中でプログラムが止まってしまうので出さないようにしている。
        }
    }

}
