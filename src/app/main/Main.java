package app.main;

import lib.toy.Robot;
import lib.toy.Train;
import lib.toy.Toy;

public class Main {
  public static void main(String[] args) {
    Toy[] toy = {new Robot(), new Train()};
    
    for (Toy t : toy) {
      t.play();
    }

  }
}