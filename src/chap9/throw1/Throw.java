package chap9.throw1;

public class Throw {
    public static void main(String[] args) {
        try {
            User3 user = new User3("", "abc123");
        } catch(Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
}