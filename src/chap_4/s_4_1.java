package chap_4;

public class s_4_1 {
    public static void main(String[] args) {
        var i = 10;
        if (i == 10) {
            System.out.println("変数は10です。");
        } else {
            System.out.println("変数は10ではありません。");
        }

        var j = 100;
        if (j > 50) {
            System.out.println("変数は50より大きいです。");
        } else if (j > 30) {
            System.out.println("変数は30より大きいです。");
        } else {
            System.out.println("変数は30以下です。");
        }

        var k = 1;
        var l = 0;
        if (k == 1) {
            if (l == 1) {
                System.out.println("変数k,lは1です。");
            } else {
                System.out.println("変数kは1ですが、変数lは1ではありません。");
            }
        } else {
            System.out.println("変数kは1ではありません。");
        }
    }

}
