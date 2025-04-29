package chap10;

public class MethodRefUnuse {

    public void walkArray(String[] data) {
        for(String value : data) {
            System.out.printf("[%s]\n",value);
        }
    }
}