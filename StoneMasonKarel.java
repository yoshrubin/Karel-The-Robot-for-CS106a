/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run() {
	turnLeft();
	moveToBuildColumn();
	turnRight();
	nextColumn();
	turnRight();
	moveToBuildColumn();
	turnLeft();
	nextColumn();
	turnLeft();
	moveToBuildColumn();
	turnRight();
	nextColumn();
	turnRight();
	moveToBuildColumn();
	turnLeft();
	}
private void buildColumn() {
	if (noBeepersPresent())
		putBeeper();
}
private void moveForward() {
	if (frontIsClear()) {
		move();
	}
}
private void moveToBuildColumn() {
	buildColumn();
	moveForward();
	buildColumn();
	moveForward();
	buildColumn();
	moveForward();
	buildColumn();
	moveForward();
	buildColumn();
}
private void nextColumn() {
	move();
	move();
	move();
	move();
}
}