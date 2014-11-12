/**
   @Author:
      Date:
   Teacher: Boyko
  */
import kareltherobot.*;
import java.awt.Color;

public class DangerousTaskDriver implements Directions
{
    public static void main(String args[])  {
        DangerousTask karel = new DangerousTask(5, 5, North, 0);
        karel.run();
        karel.turnOff();  
    } 

    static {
        int beepers = (int)(Math.random() * 10); //random beepers on corner Karel currently standing
        World.reset(); 
        World.readWorld("worlds/fig6-17.kwld"); 
        World.placeBeepers(5,5,beepers);
        if (beepers % 2 == 0) {
            World.placeBeepers(5,6,(int)(Math.random() * 50));
            World.placeBeepers(5,4, -1);
        }
        else {
            World.placeBeepers(5,6,-1);
            World.placeBeepers(5,4, (int)(Math.random() * 50)); 
        }
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
