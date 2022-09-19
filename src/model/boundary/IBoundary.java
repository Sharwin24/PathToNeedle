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
   * 
   * @return an enum representing the type.
   */
  EBoundaryType getBoundaryType();

  /**
   * Determines if the given position is within the boundary or not.
   * 
   * @param position the position to check
   * @return a boolean determining if the position is within the boundary or not.
   */
  boolean outOfBounds(IPosition position);

  /**
   * Gets the width of the Boundary. A boundary's width is always between 0 and
   * this value.
   * 
   */
  int getWidth();

  /**
   * Gets the height of the Boundary. A boundary's height is always between 0 and
   * this value.
   * 
   */
  int getHeight();

}