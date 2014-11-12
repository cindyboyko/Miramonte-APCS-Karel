
import kareltherobot.*;
/**
 * Write a description of class RepairQuad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RepairQuad extends Robot
{
    public RepairQuad(int st, int av, Direction dir, int numBeepers)
    {
        super (st, av, dir, numBeepers);
    }
    public void run(){
        int x = 0;
        while (x == 0) {
            checkColumn();
            turnRight();
            move();
        }
    }
    private void checkColumn() {
        turnLeft();
        int column = 0;
        while (column == 0) {
            move();
            if (nextToABeeper()) {
                column = 1;
            }
            if (!frontIsClear()) {
                column = 2  ;              
            }
        }
        if (column == 1) {
            goToBase();
            if  (!nextToABeeper()) {
                putBeeper();
            }
            while(frontIsClear()) {
                move();
                if (!nextToABeeper()) {
                    putBeeper();
                }
                
                
            }
            goToBase();
        }
        if (column == 2) {
            goToBase();            
        }
    }
    private void goToBase() {
        if (facingNorth()) {
            turnAround();
        }
        while(frontIsClear()) {
            move();
        }
        turnAround();
    }
    private void turnAround() {
        turnLeft();
        turnLeft();
    }
    private void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
}
