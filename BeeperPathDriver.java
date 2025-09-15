Path/**
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
       
        BeeperPath beeps = new Robot (2,1,East, 0);
        
        //Your code goes below here
        
        
        beeps.turnOff();  
    } 
    
    
   
    static {
        World.reset(); 
        World.setSize(10,10);
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(2);  
        World.setVisible(true);
    }
}
