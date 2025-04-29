package chap9.anonymous;

public class Window {//Buttonを押されたと認識する機能とそれに対してユーザーに返す機能を分けている。まさにオブジェクト指向。
    public static void main(String[] args) {
        Button load = new Button(new LoadTask());
        Button save = new Button(new SaveTask());

        load.click();
        save.click();
    }
}