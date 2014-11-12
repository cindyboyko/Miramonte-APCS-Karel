
import kareltherobot.*;
public class FenceBuilder extends Robot
{
    int fenceLength, fenceHeight, fenceCircumference = 0;
    
    public FenceBuilder(int st, int av, Direction dir, int numBeepers)
    {
        super(st, av, dir, numBeepers);
    }

    public void run(){
        while(facingNorth() == false) turnLeft();
        while(nextToABeeper() == false) move();
        while(nextToABeeper() == true){
            pickBeeper();
            fenceCircumference++;
        }
        while(facingEast() == false) turnLeft();
        for(int i=0; i<3; i++) move();
        fenceLength = measureSide()+2;
        fenceHeight = (fenceCircumference-fenceLength*2)/2;
        while(facingWest() == false) turnLeft();
        for(int i=0; i<2; i++){
            buildFence(fenceLength);
            turnRight();
            buildFence(fenceHeight);
            turnRight();
        }
    }
    
    public void turnRight(){
        for(int i=0; i<3; i++) turnLeft();
    }
    
    private void buildFence(int length){
        for(int i=0; i<length; i++){
            putBeeper();
            move();
        }
    }
    
    private int measureSide(){
        boolean onSide = true;
        int length = 0;
        while(onSide == true){
            move();
            turnLeft();
            if(frontIsClear() == false) onSide=true;
            else onSide=false;
            while(facingEast() == false) turnLeft();
            length++;
        }
        return length-2;
    }
}
