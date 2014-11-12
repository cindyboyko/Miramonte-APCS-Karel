/**
   @Author:
      Date:
   Teacher: Boyko
  */
import kareltherobot.*;
import java.awt.Color;

public class DoubleBeepersDriver implements Directions
{
    public static void main(String args[])  {
        DoubleBeepers karel = new DoubleBeepers(1, 1, East, -1);  
        karel.run();
        karel.turnOff();  
    } 

    static {
        World.reset();
        World.setSize(3,4);
        World.placeBeepers(1,2,(int)(Math.random() * 50));
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
