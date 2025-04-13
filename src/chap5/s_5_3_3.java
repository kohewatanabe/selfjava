package chap5;
import java.util.regex.Pattern;
public class s_5_3_3 {
    public static void main(String[] args) {
        var str = "初めまして。\nよろしくお願いいたします。";
        var ptn = Pattern.compile("^.+", Pattern.DOTALL);
        var match = ptn.matcher(str);
        while (match.find()) {
            System.out.println(match.group());
        }

        var tags = "<p><strong></strong></p>";
        var ptn1 = Pattern.compile("<.+?>");
        var match1 = ptn1.matcher(tags);

        while (match1.find()) {
            System.out.println(match1.group());
        }
        //名前付きキャプチャから5.3.6の手前までは一旦飛ばす。

    }

}
