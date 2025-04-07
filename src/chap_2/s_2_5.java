package chap_2;
import java.io.File;

public class s_2_5 {
    public static void main(String[] args) {
        Object o = 10;
        o = "Hoge";
        o = new File("C:\\data");
        //Objectには様々なデータが入る(データの種類によらない)。

        System.out.println(o);
    }

}
