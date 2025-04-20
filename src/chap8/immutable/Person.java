package chap8.immutable;

final class Person {//classをfinalにすると、継承できなくなる。
    private final String name;//再代入不可の変数にする。
    private final int[] age;//再代入不可の変数にする。

    public Person(String name, int age[]) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age[0];
    }

}