/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		turnLeft();
		if (frontIsBlocked()){
			turnRight();
			buildCheckerBoard();
		}
		else{
			buildCheckerBoard();
	
		}
	}
	private void buildCheckerBoard() { //builds beeper and moves one space then checks for wall
		putBeeper();
		checkForWall();
	}
	private void checkForWall() { //checks if the wall is on east or west to know were to turn
		if ((facingSouth()) && (frontIsBlocked())) {
			southWall();
		}
		else if ((facingNorth()) && (frontIsBlocked())) {
			 northWall();
		}
		else if ((facingEast()) && (frontIsBlocked())) {
			 eastWall();
		}
		else if ((facingWest()) && (frontIsBlocked())) {
			 westWall();
		}
		else if (frontIsClear()) { //if no wall  continue building
			move();
			if (frontIsClear()) {
				move();
				buildCheckerBoard();
			}
			else {
				checkForWall();
			}
		}
	}
	private void southWall() { //wall on bottom
			turnLeft();
			if (frontIsBlocked()) {
				turnLeft();
		}
			else {	
					move();
					turnLeft();
					buildCheckerBoard();
			}			
	}
	private void northWall() { //wall on top
			turnRight();
			if (frontIsBlocked()){
				turnLeft();
		}
			else {
				move();
				turnRight();
				move();
				buildCheckerBoard();
			}
	}
	private void eastWall() { //wall on bottom
			turnLeft();
			if (frontIsBlocked()) {
				turnLeft();
		}
			else {	
					move();
					turnLeft();
					move();
					buildCheckerBoard();
			}
	}	
	private void westWall() { //wall on top
			turnRight();
			if (frontIsBlocked()){
				turnLeft();
		}
			else {
				move();
				turnRight();
				buildCheckerBoard();
			}
	}	
}

