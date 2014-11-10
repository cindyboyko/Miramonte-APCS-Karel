import kareltherobot.*;

public class TreasureHunter extends Robot
{
    // instance variables - replace the example below with your own
    final int NORTH = 1, EAST = 2, SOUTH = 3, WEST = 4;
    private boolean foundTreasure = false;
    
    public TreasureHunter(int st, int av, Direction dir, int numBeepers)
    {
        super (st, av, dir, numBeepers);
    }
    
    public void run(){
        while(foundTreasure == false){
            while(nextToABeeper() == false) move();
            changeDirection();
        }
    }
    
    private void changeDirection(){
        int direction = 0;
        while(nextToABeeper() == true){
            pickBeeper();
            direction++;
        }
        if(direction == NORTH) while(facingNorth() == false) turnLeft();
        else if(direction == EAST) while(facingEast() == false) turnLeft();
        else if(direction == SOUTH) while(facingSouth() == false) turnLeft();
        else if(direction == WEST) while(facingWest() == false) turnLeft();
        else foundTreasure = true;
    }
}
