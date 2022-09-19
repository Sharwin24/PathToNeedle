package model.seeker;

import model.boundary.IPosition;
import model.boundary.Position;
import utility.Utils;
import utility.Utils.EDirection;

public class Seeker implements ISeeker {

  private IPosition position;
  private EDirection previousMove;

  public Seeker(IPosition startingPosition) {
    this.position = startingPosition;
  }

  @Override
  public IPosition currentPosition() {
    return this.position;
  }

  @Override
  public IPosition nextPosition() {
    // Determine current position
    // Determine [RANDOMLY] a direction to travel in, UP, DOWN, LEFT, RIGHT
    // Travel in the chosen direction and return the new position if it is
    // in bounds.
    // Only chose a direction that is not the inverse of the previous move
    EDirection d = Utils.randomDirection();
    while (Utils.inverseDirectionMap.get(d) == this.previousMove) {
      d = Utils.randomDirection();
    }
    previousMove = d;
    IPosition newPosition;
    switch (d) {
      case UP:
        newPosition = new Position(this.position.X(), this.position.Y() + 1);
        break;
      case LEFT:
        newPosition = new Position(this.position.X() - 1, this.position.Y());
        break;
      case RIGHT:
        newPosition = new Position(this.position.X() + 1, this.position.Y());
        break;
      case DOWN:
        newPosition = new Position(this.position.X(), this.position.Y() - 1);
        break;
      default:
        throw new IllegalStateException("Random Direction incorrectly generated");
    }
    return newPosition;
  }
}