import kareltherobot.*;
public class BuildingFence extends Robot
    
{
   //instance data variables go here.
   int i;
   int j;
    public BuildingFence (int st, int av, Direction dir, int numBeepers)
    {
        super (st, av, dir, numBeepers);
    }
    public void run()
    {
        getBeepers();
    }
    public void getBeepers ()
    {
        turnLeft();
        while (!nextToABeeper()) {
            if (!frontIsClear())
            {
                if (facingNorth())
                {
                    turnRight();
                    move();
                    turnRight();
                }
                if (facingSouth())
                {
                    turnLeft();
                    move();
                    turnLeft();
                }
            }
            if(frontIsClear())
            {
                move();
            }
        }     
        while (nextToABeeper()) 
        {
            pickBeeper();
        }
        find();
    }
    private void find() {
        move();
        turnRight();
        while (frontIsClear()) 
        {
            move();
        }
        plant();
    }
    private void plant()
    {
        while (anyBeepersInBeeperBag()) {
            if (!frontIsClear()) {
                turnLeft();
                putBeeper();
                move();
                turnRight();
            }
            if (frontIsClear()) {
                putBeeper();
                move();
                turnRight();
            }
        }
        end();
    }
    private void end() {
        turnLeft();
        turnLeft();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
        turnLeft();
    }
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}