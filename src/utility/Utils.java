package utility;

import java.util.HashMap;
import java.util.Random;
import model.boundary.IBoundary;
import model.boundary.IPosition;
import model.boundary.Position;

public class Utils {

  private static Random random = new Random();

  public enum EDirection {
    UP, LEFT, RIGHT, DOWN
  }

  private static final HashMap<Integer, EDirection> directionMap = new HashMap<>(4) {
    {
      put(0, EDirection.UP);
      put(1, EDirection.LEFT);
      put(2, EDirection.RIGHT);
      put(3, EDirection.DOWN);
    }
  };

  public static final HashMap<EDirection, EDirection> inverseDirectionMap = new HashMap<>(4) {
    {
      put(EDirection.DOWN, EDirection.UP);
      put(EDirection.RIGHT, EDirection.LEFT);
      put(EDirection.LEFT, EDirection.RIGHT);
      put(EDirection.UP, EDirection.DOWN);
    }
  };

  public static int randomNumber(int high) {
    return random.nextInt(high + 1);
  }

  public static EDirection randomDirection() {
    return directionMap.get(randomNumber(3));
  }

  public static IPosition generateRandomPosition(IBoundary boundary) {
    int x = randomNumber(boundary.getWidth());
    int y = randomNumber(boundary.getHeight());
    while (boundary.outOfBounds(new Position(x, y))) {
      x = randomNumber(boundary.getWidth());
      y = randomNumber(boundary.getHeight());
    }
    return new Position(x, y);
  }

}