import kareltherobot.*;
public class BeeperPath extends Robot
    
{
   //instance data variables go here.
   int i;
    public BeeperPath (int st, int av, Direction dir, int numBeepers)
    {
        super (st, av, dir, numBeepers);
    }
    public void run()
    {
        move();
        follow();
    }
    private void follow() {
        while (nextToABeeper()) {
            pickBeeper();
            i++;
            
            if (i==1) {
                while (nextToABeeper()) {
                    i++;
                    pickBeeper();
                }
                if (i==1) {
                    move();
                    i=0;
                }
            }
            if (i==2) {
                i=0;
                while (!facingSouth()) {
                    turnLeft();
                }
                while (frontIsClear()) {
                    move();
                }
                if (!frontIsClear()) {
                    turnRight();
                }
                while (frontIsClear()) {
                    move();
                }
                if (!frontIsClear()) {
                    turnRight();
                }
            }
        }     
        if (!nextToABeeper()) {
            turnLeft();
            turnLeft();
            move();
            check();
        }
    }
    private void check() {
        turnLeft();
        if (nextToABeeper()) {
            follow();
        }
        else {
            turnRight();
            turnRight();
            move();
            follow();
        }
    }
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}