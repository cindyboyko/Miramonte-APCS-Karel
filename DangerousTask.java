 /* 
 * @author Boyko
 * @version (a version number or a date)
 */
import kareltherobot.*;
public class DangerousTask extends Robot
    
{
   //instance data variables go here.
    
    public DangerousTask (int st, int av, Direction dir, int numBeepers)
    {
        super (st, av, dir, numBeepers);
    }
    
    public void run()
    {
        //if standing on even, go to right, else go to left
        int standingOn = 0;
        while(nextToABeeper() == true){ 
            pickBeeper();
            standingOn++;
        }
        if(standingOn%2 == 0){
            for(int i=0; i<3; i++){
                turnLeft();
            }
            move();
        }
        else{
            turnLeft();
            move();
        }
        while(nextToABeeper() == true){
            pickBeeper();
        }
    }
}