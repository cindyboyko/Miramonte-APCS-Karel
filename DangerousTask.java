 /** 
 * @author Boyko
 * @version (a version number or a date)
 */
import kareltherobot.*;
public class DangerousTask extends Robot
    
{
   //instance data variables go here.
   int i;
   int j;
    public DangerousTask (int st, int av, Direction dir, int numBeepers)
    {
        super (st, av, dir, numBeepers);
    }
    public void run()
    {
        while (nextToABeeper() == true) {
            i++;
            pickBeeper();
        }
        if (i%2 == 0) {
            east(); }
        else {
            west(); }
    }
    private void east()
    {
        turnLeft();
        move();
        finish();
    }
    private void west()
    {
        turnRight();
        move();
        finish();
    }
    private void turnRight()
    {
        for (j = 0; j != 3; j++) {
            turnLeft();
        }
    }
    private void finish() 
    {
        while (nextToABeeper()==true) {
            pickBeeper();
        }
    }
}