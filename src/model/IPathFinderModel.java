package model;

import model.boundary.EBoundaryType;
import model.boundary.IBoundary;
import model.boundary.IPosition;

public interface IPathFinderModel {

  void startPath(IBoundary boundary);

  void startPath(IBoundary boundary, IPosition needlePosition);

  void startPath(IBoundary boundary, IPosition needlePosition, IPosition seekerPosition);
}