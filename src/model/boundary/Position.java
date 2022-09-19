package model.boundary;

public class Position implements IPosition {

  private final int x;
  private final int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int X() {
    return this.x;
  }

  @Override
  public int Y() {
    return this.y;
  }
}