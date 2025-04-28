package chap9.Try;

public class Try3 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("usage : java Try <integer> <integer>");
            e.printStackTrace();//例外が発生したメソッドから始まり、そのメソッドを呼び出したメソッド、さらにその呼び出し元...と、
            //例外が発生した時点までのメソッド呼び出しの履歴が逆順にリストアップされます。
        }
    }
}