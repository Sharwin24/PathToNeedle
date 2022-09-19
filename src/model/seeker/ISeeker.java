package model.seeker;

import model.boundary.IPosition;

/**
 * An interface defining the protocol for a Seeker object.
 * An implementation of this interface will not transform or manipulate
 * the seeker's position within the boundary, however it wil give the
 * model access to the current and next position.
 */
public interface ISeeker {

  IPosition currentPosition();

  IPosition nextPosition();
}