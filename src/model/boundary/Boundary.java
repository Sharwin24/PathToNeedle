package model.boundary;

public class Boundary implements IBoundary{

  @Override
  public EBoundaryType getBoundaryType() {
    return null;
  }

  @Override
  public boolean outOfBounds(IPosition position) {
    return false;
  }

  @Override
  public IPosition needlePosition() {
    return null;
  }

  @Override
  public IPosition seekerPosition() {
    return null;
  }
}