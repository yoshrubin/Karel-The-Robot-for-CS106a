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
		buildCheckerBoard();
	}
	private void buildCheckerBoard() { //builds beeper and moves one space then checks for wall
		putBeeper();
		move();
		checkForWall();
	}
	private void checkForWall() { //checks if the wall is on east or west to know were to turn
		if ((facingEast()) && (frontIsBlocked())) {
			eastWall();
		}
		else if ((facingWest()) && (frontIsBlocked())) {
			 westWall();
		}
		else if (frontIsClear()) { // if no wall  continue building
			move();
			buildCheckerBoard();
		}
	}
	private void eastWall() { //wall on east 
			turnLeft();
			move();
			turnLeft();
			buildCheckerBoard();
	}
	private void westWall() { // wall on west
			turnRight();
			if (frontIsBlocked()){
				turnRight();
		}
			else {
				move();
				turnRight();
				buildCheckerBoard();
			}
	}	
}

