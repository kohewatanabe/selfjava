package chap8.practice;

public interface Mother {
    default void run() {
        System.out.println("I am a mother");
    }
}