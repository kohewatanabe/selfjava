package chap_7.optional2;

import java.util.Map;
import java.util.Optional;

public class OptionalNullCheck {
    public static void main(String[] args) {
        BookMap b = new BookMap(Map.of(
            "978-4-7981-5757-3", "javaScript逆引きレシピ", 
            "978-4-7981-5757-5", "andriod",
            "978-4-7981-5757-6", "java"
        ));//Map.of()はImutableMapのインスタンスを返す。それがBookMapクラスのインスタンスのdataインスタンスフィールドに入る。
        //つまりMap<String, String>型のdataインスタンスフィールドにImutableMapのインスタンスが格納される。

        Optional<String> opttitle = b.getTitleByIsbn("978-4-7981-5757-3");
        String title = opttitle.orElse("x");
        System.out.println(title.trim());

    }
}