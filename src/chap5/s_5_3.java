package chap5;
import java.util.regex.Pattern;

public class s_5_3 {
    public static void main(String[] args) {
        String[] tel = new String[] {"080-0000-0000", "184-0000"};
        var rex = "\\d{2,4}-\\d{2,4}-\\d{4}";
        for (String t : tel) {
            System.out.println(Pattern.matches(rex,t) ? t : "アンマッチ");//あくまでmatchesに渡すのは、文字列。matchesメソッド内部で文字列が正規表現にコンパイルされる。
            //\は文字列内部だとエスケープシーケンスとして認識されるので、文字列として\を表すにはエスケープシーケンス用いた表現\\を用いる必要がある。つまり"\\d"は文字列として\dと認識される。
        }

        String str = "会社の電話は0123-99-0000です。自宅は000-123-4567だよ。";
        Pattern ptn = Pattern.compile("(\\d{2,4})-(\\d{2,4})-(\\d{4})");//()で囲っているのは、正規表現の中では、()はサブマッチパターンという意味を持つから。サブマッチパターンに
        //指定しておくと、マッチした全体文字列をサブマッチパターン単位で部分的に取り出すことが出来る。
        var match = ptn.matcher(str);
        while(match.find()) {
            System.out.println("開始位置 : " + match.start());
            System.out.println("修了位置 : " + match.end());
            System.out.println("マッチングした文字列:" + match.group());
            System.out.println("市外局番 : " + match.group(1));
            System.out.println("市内局番 : " + match.group(2));
            System.out.println("加入者番号 : " + match.group(3));
            System.out.println("---------");
        }
    }
}
