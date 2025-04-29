package chap10.method;

public class MethodRefUnuse {
    
    public void walkArray(String[] data, Output output) {
        for (String value : data) {
            output.print(value);
        }
    }

    static void addQuote(String value) {
        System.out.printf("[%s]\n", value);
    }
}