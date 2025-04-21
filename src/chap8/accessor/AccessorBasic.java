package chap8.accessor;

public class AccessorBasic {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("山田太郎");
        person.setAge(12);

        System.out.println(person.show());
    }
}]]]