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
	private void buildCheckerBoard() {
		putBeeper();
		move();
		checkForWall1();
	}
	private void checkForWall1() {
		if ((facingEast()) && (frontIsBlocked())) {
			turnLeft();
			move();
			turnLeft();
			buildCheckerBoard();
		}
		else {
			checkForWall2();
		}
	}
	private void checkForWall2() {
		if ((facingWest()) && (frontIsBlocked())) { 
			turnRight();
			checkToEnd();
		}
		else {
			move();
			buildCheckerBoard();
		}	
	}
	private void checkToEnd() {
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

