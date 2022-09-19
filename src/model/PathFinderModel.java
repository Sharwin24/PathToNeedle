package model;

import model.boundary.IBoundary;
import model.boundary.IPosition;
import model.seeker.ISeeker;
import model.seeker.Seeker;
import utility.Utils;

public class PathFinderModel {

	public static void startPath(IBoundary boundary) {
		// Use Given Boundary and generate random needle and seeker positions
		IPosition needlePosition = Utils.generateRandomPosition(boundary);
		IPosition seekerPosition = Utils.generateRandomPosition(boundary);
		while (needlePosition.equals(seekerPosition)) {
			seekerPosition = Utils.generateRandomPosition(boundary);
		}
		ISeeker seeker = new Seeker(seekerPosition);
		// Kick off the path finding algorithm
		int stepsTaken = 0;
		while (!needlePosition.equals(seekerPosition)) {
			while (boundary.outOfBounds(seeker.nextPosition())) {
				seekerPosition = seeker.nextPosition();
			}
			System.out.println("Seeker is at: " + seekerPosition);
			stepsTaken++;
		}
		System.out.println("Found the needle in " + stepsTaken + " steps!");
		System.out.println("Needle was at: " + needlePosition + " and seeker was at: " + seekerPosition);
	}

	public static void startPath(IBoundary boundary, IPosition needlePosition) {
		// Use Given Boundary and generate random seeker position
	}

	public static void startPath(IBoundary boundary, IPosition needlePosition, IPosition seekerPosition) {
		// Use Given Boundary and Given needle and seeker positions
	}

}
