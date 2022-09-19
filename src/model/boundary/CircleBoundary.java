package model.boundary;

public class CircleBoundary extends ABoundary {

	private final double radius;

	public CircleBoundary(int radius) {
		super(EBoundaryType.CIRCLE, radius, radius);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	@Override
	public boolean outOfBounds(IPosition position) {
		return Math.sqrt(Math.pow(position.X(), 2) + Math.pow(position.Y(), 2)) > this.radius;
	}

}
