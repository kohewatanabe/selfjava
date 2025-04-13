package chap5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class s_5_5_3_x {
    public static void main(String[] args) {
        final var file = "C:\\data\\article.ser";

        try (var out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(new s_5_5_3("最新アップデート解説", "https://codezine.jp/article.corner/839", false));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (var in = new ObjectInputStream(new FileInputStream(file))){
            var a = (s_5_5_3)in.readObject();
            System.out.println(a);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }//ファイルの生成などは上手く行っているが、シリアライズは上手く行っていない??
    }
}
