package chap_7.method;

public class OverloadClient {
    static void main(String[] args) {
        OverloadAnti c = new OverloadAnti();
        CharSequence[] list = new CharSequence[] {
            "春はあけぼの",
            new StringBuilder("夏は夜"),
            new StringBuffer("秋は夕暮れ")
        };//StringもStringBuilderもStringBuffeも全てCharSequence型に全てキャストされる。
        
        for (CharSequence cs : list) {
            c.show(cs);
        }
    }

}
