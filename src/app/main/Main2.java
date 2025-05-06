package app.main;

import toy.Toy;
import toy.Robot;
import toy.Train;
import lib.transport.Transport;
import lib.transport.Bus;
// import transport.Train;

public class Main2 {
  public static void main(String[] args) {
    Toy[] toy = {new Robot(), new toy.Train()};
    Transport[] transport = {new Bus(), new transport.Train()};

    for (Toy i : toy) {
      i.play();
    }

    for (Transport j : transport) {
      j.ride();
    }
  }
}
