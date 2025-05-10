package transport;

public class Train implements Transport {
  @Override
  public void ride() {
    System.out.println("Riding a train.");
  }
}