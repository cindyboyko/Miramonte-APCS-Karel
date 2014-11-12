/**
   @Author:
      Date:
   Teacher: Boyko
  */
import kareltherobot.*;
import java.awt.Color;

public class FindingMovingBeeperDriver implements Directions
{
    public static void main(String args[])  {
        MovingBeeperFinder karel = new MovingBeeperFinder(2, 8, East, 0);  
        karel.run();
        karel.turnOff();  
    } 

    static {
        
        int beeperStreet = (int)(Math.random()*4) + 3;
        int beeperAve = (int)(Math.random()*3) + 3;
        int shift; 
        if (Math.random() > 0.5) shift = 0;
        else shift = 1;
        World.reset(); 
        World.readWorld("worlds/fig6-29.kwld");
        World.placeBeepers(beeperStreet, beeperAve, 1);
        World.placeEWWall(beeperStreet -1*shift, beeperAve, 1);
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
