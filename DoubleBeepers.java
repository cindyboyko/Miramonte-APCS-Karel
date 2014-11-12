 /* 
 * @author Boyko
 * @version (a version number or a date)
 */
import kareltherobot.*;
public class DoubleBeepers extends Robot
    
{
   //instance data variables go here.
   private int numberOfBeepers = 0;
   public DoubleBeepers (int st, int av, Direction dir, int numBeepers)
   {
       super (st, av, dir, numBeepers);
   }
   public void run()
   {
      move();
      pickUpBeepers();
      for (int i = 0; i < numberOfBeepers * 2; i++){
          putBeeper();
      }
      returnToOrigin();
   }
   public void pickUpBeepers(){
       while (nextToABeeper() == true){
           pickBeeper();
           numberOfBeepers++;
       }
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
