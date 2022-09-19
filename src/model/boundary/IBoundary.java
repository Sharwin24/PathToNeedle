package model.boundary;

/**
 * Interface representing the protocol for defining
 * and constructing a Boundary. A Boundary has a specific
 * type, determined by the {@link EBoundaryType}. Depending
 * on the boundary type, the implementation for out of Bounds, and
 * potentially position may vary.
 */
public interface IBoundary {

  /**
   * Determines the boundary type.
   * @return an enum representing the type.
   */
  EBoundaryType getBoundaryType();

  /**
   * Determines if the given position is within the boundary or not.
   * @param position the position to check
   * @return a boolean determining if the position is within the boundary or not.
   */
  boolean outOfBounds(IPosition position);

  /**
   * Gets the needle's position.
   * @return a position object.
   */
  IPosition needlePosition();
  /**
   * Gets the seeker's position.
   * @return a position object.
   */
  IPosition seekerPosition();

}