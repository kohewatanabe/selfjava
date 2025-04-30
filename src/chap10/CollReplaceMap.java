package chap10;

import java.util.HashMap;
import java.util.Map;

public class CollReplaceMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(
            Map.of("orange", "みかん", "apple", "りんご", "strawberry", "いちご")
        );
        map.replaceAll((k, v) -> {
            return k.charAt(0) + v;
        });
        System.out.println(map);
    }
}