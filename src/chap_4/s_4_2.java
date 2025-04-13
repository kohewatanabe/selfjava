package chap_4;

public class s_4_2 {
    public static void main(String[] args) {
        var i = 6;
        while (i < 6) {
            System.out.println(i + "番目のループです。");
            i ++;
        }

        var j = 6;

        do {
            System.out.println(j + "番目のループです。");
            j ++;
        } while (j < 6);

    }

}
