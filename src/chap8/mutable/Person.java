package chap8.mutable;

import java.util.Arrays;

final class Person {//classをfinalにすると、継承できなくなる。
    private final String name;//再代入不可の変数にする。
    private final int[] age;//再代入不可の変数にする。

    public Person(String name, int[] age) {
        this.name = name;
        //this.age = age;
        this.age = Arrays.copyOf(age, 3);//このようにすれば、インスタンス変数に格納される参照型のアドレスは、呼び出し元で代入した参照型とは異なるので、呼び出し元からの変更を完全にブロックできる。
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age[0];
    }

}