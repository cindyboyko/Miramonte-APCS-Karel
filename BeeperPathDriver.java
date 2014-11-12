/**
   @Author:
      Date:
   Teacher: Boyko
  */
import kareltherobot.*;
import java.awt.Color;

public class BeeperPathDriver implements Directions
{
    public static void main(String args[])  {
        //DO NOT MODIFY THIS CODE
        
        PathRunner karel = new PathRunner(2, 1, East, 0);  
        //Your code goes below here
        karel.move();
        karel.run();
        
        karel.turnOff();  
    } 
    
    
   
    static {
        World.reset(); 
        World.setSize(31, 20);
        World.readWorld("worlds/fig6-25.kwld"); 
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(2);  
        World.setVisible(true);
    }
}
