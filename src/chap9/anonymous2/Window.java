package chap9.anonymous2;

public class Window {
    public static void main(String[] args) {
        Button load = new Button(new Task(){//new 型(引数) {宣言} 宣言には匿名クラスのメンバを書く。
            //GUIアプリケーションなどで、ボタンクリックやウィンドウ操作といったイベントが発生した際に実行される処理(イベントハンドラ)を定義する場合によく使われる。
            @Override
            public void run() {
                System.out.println("Load");
            }
        });
        Button save = new Button(new Task() {
            @Override
            public void run() {
                System.out.println("Save");
            }
        });

        load.click();
        save.click();
    }
}