package model.boundary;

/**
 * Immutable class to represent a position in a 2D plane.
 */
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

  @Override
  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Position)) {
      return false;
    }
    Position other = (Position) obj;
    return this.x == other.x && this.y == other.y;
  }
}