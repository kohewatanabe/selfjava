package chap8.implement;

public class InterfaceDefault {
    public static void main(String[] args) {
        Loggable l = new Loggablelmpl();
        l.log("WINGS");//オーバーライドしなくても、継承と同じように親クラスのvtableの参照が子クラスに格納されているため、
        //親クラスと同じメソッドを子クラスから呼び出せる(あくまで参照があるのは子クラス。子クラスから呼び出している)。
    }
}