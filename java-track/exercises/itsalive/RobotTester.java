package itsalive;

import static org.junit.Assert.*;

import org.junit.Test;

import itsalive.Robot;

public class RobotTester {

	@Test
	public void testMove() {
		Robot a = new Robot("R2", 10, 10, 5, "West");
		a.move();
		assertTrue("Have the robot move based on speed and orientation", a.getX() == 5);
	}
	
	@Test
	public void testRotate() {
		Robot a = new Robot("R2", 10, 10, 5, "West");
		a.rotate("right");
		assertTrue("Have the robot move based on speed and orientation", a.getOrientation() == "North");
	}
	
	@Test
	public void testDistance() {
		Robot a = new Robot("R2", 10, 10, 5, "West");
		Robot b = new Robot("R4", 3, 2, 1, "North");
		assertTrue("Have the robot move based on speed and orientation", a.distance(b) == Math.sqrt(Math.pow((b.getX() - a.getX()),2) + Math.pow((b.getY() - a.getY()), 2)));
	}
}
