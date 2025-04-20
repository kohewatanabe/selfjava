package chap8.hiding;

public class HideBasic{
    public static void main(String[] args) {
        BusinessPerson businessperson = new BusinessPerson();

        System.out.println(businessperson.birth);
        businessperson.show();//子クラスのインスタンス生成と同時に親クラスのインスタンスも生成されるので、showメソッドの中で、superを呼び出して親クラスのインスタンスにアクセスできる。
    }
}