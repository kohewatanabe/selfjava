package chap9.Person;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override// ObjectクラスのtoStringメソッドをオーバーライドする。
    public String toString() {
        return String.format("名前は、%s %sです。",
        this.lastName, this.firstName);
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
} 
