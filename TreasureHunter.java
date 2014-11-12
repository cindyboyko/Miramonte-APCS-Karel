import kareltherobot.*;
public class TreasureHunter extends Robot
    
{
   //instance data variables go here.
   int i;
    public TreasureHunter (int st, int av, Direction dir, int numBeepers)
    {
        super (st, av, dir, numBeepers);
    }
    public void run()
    {
        while (nextToABeeper())
        {
            i++;
            pickBeeper();
        }
        if (i==1) {
            i=0;
            north();
        }
        else if (i==2) {
            i=0;
            east();
        }
        else if (i==3) {
            i=0;
            south();
        }
        else if (i==4) {
            i=0;
            west();
        }
        else if (i==5) {
            setVisible(true);
        }
    }
    private void north() 
    {
        //1 beeper
        while (!facingNorth()) {
            turnLeft();
        }
        while(!nextToABeeper()) {
            move();
        }
        run();
    }
    private void south()
    {
        //3 Beepers
                while (!facingSouth()) {
            turnLeft();
        }
        while(!nextToABeeper()) {
            move();
        }
        run();
    }
    private void east() 
    {
        //2 Beepers
                while (!facingEast()) {
            turnLeft();
        }
        while(!nextToABeeper()) {
            move();
        }
        run();
    }
    private void west()
    {
        //4 Beepers
                while (!facingWest()) {
            turnLeft();
        }
        while(!nextToABeeper()) {
            move();
        }
        run();
    }
    private void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}