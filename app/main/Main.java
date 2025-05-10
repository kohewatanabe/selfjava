package main;

import toy.*;


public class Main {
  public static void main(String[] args) {
    Toy[] toy = {new Robot(), new Train()};
    for (Toy t : toy) {
      t.play();
    }
  }
}