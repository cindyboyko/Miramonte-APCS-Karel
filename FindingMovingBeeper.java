import kareltherobot.*;
public class FindingMovingBeeper extends Robot
    
{
    //instance data variables go here.
    int i;
    public FindingMovingBeeper (int st, int av, Direction dir, int numBeepers)
    {
        super (st, av, dir, numBeepers);
    }
    public void run()
    {
        turnLeft();
        for (i=0; i < 5; i++) {
            move();
        }
        turnLeft();
        reset();
    }
    private void reset() {
        while (frontIsClear() && !nextToABeeper()) {
            move();
        }
        if (!frontIsClear()) {
            if (facingWest()) {
                turnLeft(); 
                move();
                turnLeft();
                reset();
            }
            else if (facingEast()) {
                turnRight();
                move();
                turnRight();
                reset();
            }
        }
        if (nextToABeeper()) {
            pickBeeper();
            while (frontIsClear()) {
                move();
            }
            if (facingWest()) {
                turnLeft();
                while (frontIsClear()) {
                    move();
                }
                turnLeft();
                while (frontIsClear()) {
                    move();
                }
            }
            else if (facingEast()) {
                turnRight();
                while (frontIsClear()) {
                    move();
                }
            }
        }
    }
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}