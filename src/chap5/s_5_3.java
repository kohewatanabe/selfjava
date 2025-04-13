package chap5;
import java.util.regex.Pattern;

public class s_5_3 {
    public static void main(String[] args) {
        String[] tel = new String[] {"080-0000-0000", "184-0000"};
        var rex = "\\d{2,4}-\\d{2,4}-\\d{4}";
        for (String t : tel) {
            System.out.println(Pattern.matches(rex,t) ? t : "アンマッチ");//あくまでmatchesに渡すのは、文字列。matchesメソッド内部で文字列が正規表現にコンパイルされる。
            //\は文字列内部だとエスケープシーケンスとして認識されるので、コンピュータに読み込ませた時に\を表すにはエスケープシーケンス用いた表現\\を用いる必要がある。つまり文字列として"\\d"→\dとなる。

        }

    }

}
