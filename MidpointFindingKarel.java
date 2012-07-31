/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {
        if (frontIsClear()) {
                moveToMidpoint();
        }
        putBeeper();
}

private void moveToMidpoint() { // starting east, for every two corners Karel moves east, after reaching the east end of the street, Karel moves back one corner to the west.
        if (facingEast()) { // move up to two corners to the east, if possible
                move();
                if (frontIsClear()) {
                        move();
                        if (frontIsClear()) {
                                moveToMidpoint(); //method calls itself
                        } else {
                                turnAround(); // turn around, if end of street in the east is reached
                        }
                } else {
                                turnAround(); // turn around, if end of street in the east is reached
                }
        }
        move(); // move back one corner to the west
}

}
