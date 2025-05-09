package lib2.transport;//libが新たなモジュールなので、そこからのルートが新たなルートになる。

public class Bus implements Transport {
  @Override
  public void ride() {
    System.out.println("Riding a bus.");
  }
}