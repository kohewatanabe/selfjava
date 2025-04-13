package chap5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class s_5_5 {
    public static void main(String[] args) {
        try (var writer = Files.newBufferedWriter(Paths.get("C:\\data\\data.log"))) {//書き込み
            writer.write(LocalDateTime.now().toString());
            writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (var reader = Files.newBufferedReader(Paths.get("C:\\data\\data.log"))) {//読み込み
                var line = "";
                while ((line = reader.readLine()) != null) {//readLineメソッドは、読み込んでいるファイルの次の行がない場合、nullを返す。
                    //javaは宣言文やfor文などのステートメント以外である、式(x=1;などの代入文も含まれる)は全て値を返す。なので、whileの条件式のところに代入文が書ける。
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        
    }

}
