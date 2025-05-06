package lib.transport;

public class Bus implements Transport {
  @Override
  public void ride() {
    System.out.println("Riding a bus.");
  }
}