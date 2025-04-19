package chap_7.optional2;

import java.util.Map;
import java.util.Optional;

public class BookMap {
    private Map<String, String> data;

    public BookMap(Map<String, String> data) {
        this.data = data;
    }

    public Optional<String> getTitleByIsbn(String isbn) {
        return Optional.ofNullable(this.data.get(isbn));
    }
}//Optionalでラップすることで、nullチェックが強制される(例外処理を書かないと必ずエラーになる)。
//逆にOptionalを書かないとif文などで例外処理を書くことになるが、仮に例外処理を書き忘れても
//nullが入らない限りはエラーを吐かない。つまり、脆弱性のあるコードだとすぐに気付けない。