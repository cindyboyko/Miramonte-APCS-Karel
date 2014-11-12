/**
   @Author:
      Date:
   Teacher: Boyko
  */
import kareltherobot.*;
import java.awt.Color;

public class SortingTaskDriver implements Directions
{
    public static void main(String args[])  {
        //Do NOT modify the code below
        Robot stackBot = new Robot(1, 1,East, -1);
       
        stackBot.setVisible(false);
        stackBot.turnOff();
        
        
        //Your code goes here:
        Sorter karel = new Sorter(8, 2, West, 0);
        karel.run();
        karel.turnOff();  
    } 
    
   
    
    static {
        World.reset(); 
        //World.readWorld("worlds/fig6-31.kwld"); 
        //World.readWorld("worlds/sortsolution.kwld");
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(2);  
        World.setVisible(true);
    }
}
