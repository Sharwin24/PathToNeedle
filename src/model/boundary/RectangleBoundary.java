package model.boundary;

public class RectangleBoundary extends ABoundary {

	public RectangleBoundary(int width, int height) {
		super(EBoundaryType.RECTANGLE, height, width);
	}

	@Override
	public boolean outOfBounds(IPosition position) {
		return position.X() > this.width
				|| position.Y() > this.height
				|| position.X() < 0
				|| position.Y() < 0;
	}

}
