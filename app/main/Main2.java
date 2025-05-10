package main;

import toy.*;
import transport.*;

public class Main2 {
  public static void main(String[] args){
    Toy[] toy = {new Robot(), new toy.Train()};

    for (Toy t : toy) {
      t.play();
    }

    Transport[] transport = {new Bus(), new transport.Train()};

    for (Transport t : transport) {
      t.ride();
    }
  }
}