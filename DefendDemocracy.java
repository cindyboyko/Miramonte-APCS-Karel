/* 
 * @author Boyko
 * @version (a version number or a date)
 */
import kareltherobot.*;
public class DefendDemocracy extends Robot
    
{
   //instance data variables go here.
   private int numberOfBeepers = 0;
   public DefendDemocracy (int st, int av, Direction dir, int numBeepers)
   {
       super (st, av, dir, numBeepers);
   }
   public void run()
   {
      for (int i = 0; i < 5; i++){
          move();
          checkBeepers();
          move();
      }
   }
   public void checkBeepers(){
       if (nextToABeeper() == true){
           pickBeeper();
           while (facingNorth() == false){
               turnLeft();
           }
           move();
           pickBeeper();
           turnAround();
           move();
           move();
           pickBeeper();
           turnAround();
           move();
           while (facingEast() == false){
               turnLeft();
           }
       }
   }
   public void turnAround(){
       turnLeft();
       turnLeft();
   }
}
