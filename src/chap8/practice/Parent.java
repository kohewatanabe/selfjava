package chap8.practice;

public class Parent implements Mother, Father {
    public void run() {
        Father.super.run();//Fatherの実装を呼び出す。
        Mother.super.run();//Motherの実装を呼び出す。インターフェイスの実装を呼び出すときはインターフェイス名.super.メソッド名。
    }
}