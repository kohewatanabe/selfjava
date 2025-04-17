package chap_7.optional;
import java.util.Map;

public class NullCheckBasic{
    public static void main(String[] args) {
        BookMap b = new BookMap(Map.of(
            "978-4-7981-5757-3", "javascript",
            "978-4-7981-5757-8", "java",
            "978-4-7981-5757-7", "python"
        ));

        String title = b.getTitleByIsbn("978-4-7981-5757-3");
        if (title == null) {
            System.out.println("書籍は存在しません。");
        } else {
            System.out.println(title.trim());
        }
    }
}//次はこれをOptionalで書き換える。
