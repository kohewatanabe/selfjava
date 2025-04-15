package chap_7.method;

public class OverloadAnti {
    public void show(String value){
        System.out.println("String : " + value);
    }

    public void show(StringBuilder builder) {
        System.out.println("StringBuilder : " + builder);
    }

    public void show(StringBuffer buffer) {
        System.out.println("StringBuffer : " + buffer);
    }

    public void show(CharSequence cs) {
        System.out.println("CharSequence : " + cs);
    }

}
