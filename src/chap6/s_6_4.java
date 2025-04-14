package chap6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class s_6_4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>(Map.of("Rose", "バラ", "Sunflower", "ひまわり", "Morning Gloly", "あさがお"));
        System.out.println(map);
        System.out.println(map.containsKey("Rose"));
        System.out.println(map.containsValue("バラ"));
        System.out.println(map.isEmpty());

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (String value : map.values()) {
            System.out.println(value);
        }

        map.replace("Rose", "薔薇");
        map.replace("Sunflower", "ひまわり", "向日葵");

        for (Entry<String, String> entry : map.entrySet()) {//ここの型変換の部分が分からん。一旦飛ばす。
            System.out.println(entry.getKey() + ":"+ entry.getValue());
        }

        Integer key1 = Integer.valueOf(256);
        Integer key2 = Integer.valueOf(256);

        Map<Integer, String> data = new HashMap<Integer, String>() {
            {
                put(key1, "Hoge");
                put(key2, "Foo");
            }
        };
        System.out.println(data);//HashMapはキーを同値性で管理する。つまり、同値なキーは同じハッシュ値になるため、１つしかキーが残らない。
        //HashMapではキーとハッシュ表のハッシュ値(ハッシュ表の中の住所)が対応付けられていて、そのハッシュ値のあるハッシュ表の中箇所にキーに対応した値が格納されている。

    }

}
