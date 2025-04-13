package chap5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class s_5_5_2 {
    public static void main(String[] args) {
        try (
            var in = new BufferedInputStream(//バッファー機能を備えたバイトストリーム
                new FileInputStream("C:\\data\\input.png")//ファイルへの入出力を行うために、BufferedInputStreamのコンストラクタにFileInputStreamオブジェクトを渡す。
            );
            var out = new BufferedOutputStream(
                new FileOutputStream("C:\\data\\output.png")
            );
        ) { 
            var data = -1;
            while ((data = in.read()) != -1) {//バイトストリームのreadメソッドは終端で-1を返す。
                out.write((byte) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}