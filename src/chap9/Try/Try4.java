package chap9.Try;

public class Try4 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);//最初にエラーが発生した箇所でtry文の実行は打ち切りになり、catch節に進む。
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("error : division by zero");
        } catch (Exception e) {
            System.out.println("usage : java Try <integer> <integer>");
        } finally {
            System.out.println("thank you");
        }
    }
}