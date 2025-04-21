package chap8.type;

public class TypeGetBasic {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.getClass());

        Person p2 = new BusinessPerson();
        System.out.println(p2.getClass());//getClassメソッドは変数の型ではなく、オブジェクト(実体)の型を返す。
    }
}