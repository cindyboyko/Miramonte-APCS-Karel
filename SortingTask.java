 /* 
 * @author Boyko
 * @version (a version number or a date)
 */
import kareltherobot.*;
public class SortingTask extends Robot
    
{
   //instance data variables go here.
   private int numberOfBeepers = 0;
   public SortingTask (int st, int av, Direction dir, int numBeepers)
   {
       super (st, av, dir, numBeepers);
   }
   public void run(){
    returnToOrigin();
    while (facingEast() == false){
       turnLeft();
    }
       for (int i = 0; i < 10; i++){
       for (int x = 0; x < 8; x++){
           if (nextToABeeper() == true){
               pickBeeper();
           }
           move();
       }
       turnAround();
       for (int y = 0; y < 8; y++){
           move();
           if (anyBeepersInBeeperBag() == true){
               putBeeper();
           }
       }
       turnRight();
       move();
       turnRight();
    }
    returnToOrigin();
   }
   public void turnRight(){
       for (int i = 0; i < 3; i++){
           turnLeft();
        }
   }
   public void turnAround(){
       turnLeft();
       turnLeft();
   }
      public void returnToOrigin(){
       while (facingNorth() == false){
           turnLeft();
       }
       turnLeft();
       while (frontIsClear() == true){
           move();
       }
       turnLeft();
       while (frontIsClear() == true){
           move();
       }
       while (facingNorth() == false){
           turnLeft();
       }
    }
}

