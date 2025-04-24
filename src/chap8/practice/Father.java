package chap8.practice;

public interface Father {
    default void run() {
        System.out.println("I am a father");
    }
}