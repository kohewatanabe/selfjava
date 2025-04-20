package chap8.immutable;

class ImmutableBasic {
    public static void main(String[] args) {

        int[] age = {12, 13, 14};

        Person person = new Person("山田太郎", age);
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}