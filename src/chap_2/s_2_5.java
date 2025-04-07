package chap_2;
import java.io.File;

public class s_2_5 {
    public static void main(String[] args) {
        File f = new File("C:/data/sample.dat");
        String name = f.getName();

        System.out.println(name);
    }

}
