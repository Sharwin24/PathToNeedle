package model.boundary;

public abstract class ABoundary implements IBoundary {

  protected final EBoundaryType boundaryType;
  protected final int height;
  protected final int width;

  // Constructs a boundary with the given boundary type and dimensions
  public ABoundary(EBoundaryType boundaryType, int height, int width) {
    this.boundaryType = boundaryType;
    this.height = height;
    this.width = width;
  }

  @Override
  public EBoundaryType getBoundaryType() {
    return this.boundaryType;
  }

  @Override
  public abstract boolean outOfBounds(IPosition position);

  @Override
  public int getWidth() {
    return this.width;
  }

  @Override
  public int getHeight() {
    return this.height;
  }
}