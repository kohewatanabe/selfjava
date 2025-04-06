package chap_2;

public class s_2_3 {
    public static void main(String[] args) {

        double x = 0.14142e6;
        var value = 1_234_567;
        var pi = 3.141_592;
        char str = '\'';
        String str2 = """
                夏は夜。\n
                月の頃はさらなり、\n
                闇もなほ、"ほたる"の多く飛びちがひたる。
                """;

        System.out.println(x);
        System.out.println(2147483648L);
        System.out.println(value);
        System.out.println(pi);
        System.out.println('あ');
        System.out.println('\u3042');
        System.out.println("You are \"great\" player");
        System.out.println(str);
        System.out.println(str2);
    }

}
