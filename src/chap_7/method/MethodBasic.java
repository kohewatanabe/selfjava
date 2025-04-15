package chap_7.method;

public class MethodBasic {
    static void main(String[] args) {
        Person person = new Person();
        person.name = "山田太郎";
        person.age = 30;

        System.out.println(person.show());

    }

}
