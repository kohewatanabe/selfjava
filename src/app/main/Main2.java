package app.main;

import lib.toy.Toy;
import lib.toy.Robot;
import lib.toy.Train;
import lib.transport.Transport;
import lib.transport.Bus;
// import transport.Train;

public class Main2 {
  public static void main(String[] args) {
    Toy[] toy = {new Robot(), new lib.toy.Train()};
    Transport[] transport = {new Bus(), new lib.transport.Train()};

    for (Toy i : toy) {
      i.play();
    }

    for (Transport j : transport) {
      j.ride();
    }
  }
}
