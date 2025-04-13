package chap5;
import java.util.regex.Pattern;

public class s_5_3_2 {
    public static void main(String[] args) {
        var str = "10人のインディアン。\n1年生になったら。";
        var ptn = Pattern.compile("^\\d*", Pattern.MULTILINE);
        var match = ptn.matcher(str);
        while (match.find()) {
            System.out.println(match.group());
        }

    }

}
