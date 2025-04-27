package chap9.clone;

public class Person implements Cloneable{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Person clone() {
        Person p = null;
        try {
            p = (Person)super.clone();//Objectクラスのcloneメソッドのドキュメントが勉強になる。cloneを呼び出しているオブジェクトがCloneableを実装したクラスのオブジェクトであるか確認し、
            //違う場合は例外を返す。実装したオブジェクトだった場合はJVMが勝手にシャロ―コピーしたオブジェクトをオブジェクト型で返してくれる(native型)。
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        return p;
    }

    @Override
    public String toString() {
        return this.lastName + this.firstName;
    }

}