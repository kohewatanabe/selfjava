package chap9.equals;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override//このクラスの同値性を判断するために必用。このクラスをフィールドに持つ他のクラスがあったとして、そのクラスの同値性を判断するとかなった場合でも、このクラスの同値性を判断する
    //equalsメソッドが定義されてないと、大元のクラスの同値性を判断できなくなるため、このオーバーライドはかなり重要かもしれない。
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(obj instanceof Person p) {
            return Objects.equals(this.firstName, p.firstName) &&
            Objects.equals(this.lastName, p.lastName);//Objects.eqalsは、渡したObjectの同値性を判断する。
        }
        return false;
    }
}