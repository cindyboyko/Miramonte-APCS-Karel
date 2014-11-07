import kareltherobot.*;
public class PathRunner extends Robot
{
    final int NORTH=1, EAST=2, SOUTH=3, WEST=4;
    int crumbs;
    public PathRunner(int st, int av, Direction dir, int numBeepers)
    {
        super (st, av, dir, numBeepers);
    }
    public void run(){
        while(crumbs<2){
            crumbs = 0;
            go(whichWay());
            while(nextToABeeper() == true){
                pickBeeper();
                crumbs++;
            }
        }
    }
    private void go(int direction){
        if(direction == NORTH) while(facingNorth() == false) turnLeft();
        else if(direction == EAST) while(facingEast() == false) turnLeft();
        else if(direction == SOUTH) while(facingSouth() == false) turnLeft();
        else if(direction == WEST) while(facingWest() == false) turnLeft();
        move();
    }
    private int whichWay(){
        if(isWay(NORTH) == true) return NORTH;
        if(isWay(EAST) == true) return EAST;
        if(isWay(SOUTH) == true) return SOUTH;
        if(isWay(WEST) == true) return WEST;
        return 0;
    }
    private boolean isWay(int direction){
        if(direction == NORTH) while(facingNorth() == false) turnLeft();
        else if(direction == EAST) while(facingEast() == false) turnLeft();
        else if(direction == SOUTH) while(facingSouth() == false) turnLeft();
        else if(direction == WEST) while(facingWest() == false) turnLeft();
        move();
        if(nextToABeeper() == true){
            turnAround();
            move();
            return true;
        }
        else{
            turnAround();
            move();
            return false;
        }
    }
    private void turnRight(){
        for(int i=0; i<3; i++) turnLeft();
    }
    private void turnAround(){
        for(int i=0; i<2; i++) turnLeft();
    }
}
