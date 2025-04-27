package chap9.equals;

public class PersonMain {
    public static void main(String[] args) {
        Person s  = new Person("yamada", "taro");
        Person l = new Person("yamada", "taro");
        System.out.println(s.equals(l));
        System.out.println(l.equals(s));

    }
}