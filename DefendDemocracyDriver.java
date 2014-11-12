/**
   @Author:
      Date:
   Teacher: Boyko
  */
import kareltherobot.*;
import java.awt.Color;

public class DefendDemocracyDriver implements Directions
{
    public static void main(String args[])  {
        DefendDemocracy karel = new DefendDemocracy(3, 1, East, 0);  
        karel.run();
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/hangingchad.kwld"); 
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
