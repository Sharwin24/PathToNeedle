package utility;

import java.util.HashMap;
import java.util.Random;

public class Utils {

  private static Random random;

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

  public static int randomNumber(int high) {
    return random.nextInt(high + 1);
  }

  public static EDirection randomDirection() {
    return directionMap.get(randomNumber(3));
  }

}