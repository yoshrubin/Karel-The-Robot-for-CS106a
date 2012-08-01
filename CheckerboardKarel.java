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
        if ((facingEast()) || (facingNorth())) {
            putBeeper();
            checkForWall();
            else {
                checkForWall();
                putbeeper();
            }
	}
	private void checkForWall() { //checks if the wall is on east or west north or south (east and west for 1 hight rectangles) to know were to turn
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
	private void southWall() { //if wall on bottom turn aroung on next level
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
	private void northWall() { //if wall on top turn aroung on next level
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
	private void eastWall() { //if wall on east turn aroung on next level
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
	private void westWall() { //if wall on west turn turn aroung on next level
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

