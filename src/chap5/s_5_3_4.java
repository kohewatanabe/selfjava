package chap5;

public class s_5_3_4 {
    public static void main(String[] args) {
        var str = "サポートサイトはhttps://www.wings.msn.to/です。";
        System.out.println(str.replaceAll(
            "(?i)http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w ./?%&=-]*)?",
            "<a href=\"$0\">$0</a>"
        ));
    }

}
