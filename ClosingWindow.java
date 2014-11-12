 /** 
 * @author Boyko
 * @version (a version number or a date)
 */
import kareltherobot.*;
public class ClosingWindow extends Robot
    
{
   //instance data variables go here.
   int i;
   int j;
    public ClosingWindow (int st, int av, Direction dir, int numBeepers)
    {
        super (st, av, dir, numBeepers);
    }
    public void run()
    {
        check();
    }
    private void check() {
        if (frontIsClear()) {
            move();
            turnLeft();
        }
        else if (!frontIsClear()) {
            turnRight();
            move();
            turnLeft();
        }
        if (frontIsClear()) {
            move();
            if (nextToABeeper()) {
                turnLeft();
                turnLeft();
                move();
                move();
                turnOff();
            }
            else if (!nextToABeeper()) {
               putBeeper();
            }
            turnLeft();
            turnLeft();
            move();
            turnLeft();
            check();
        }
        else if (!frontIsClear()) {
            turnRight();
            check();
        }
    }
    private void turnRight()
    {
        for (j = 0; j != 3; j++) {
            turnLeft();
        }
    }
}