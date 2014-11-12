import kareltherobot.*;
public class WindowCloser extends Robot
{
    public WindowCloser(int st, int av, Direction dir, int numBeepers)
    {
        super(st, av, dir, numBeepers);
    }

    public void run(){
        int turns = 0;
        while(windowsNeedClosing(turns)){
            closeWindow();
            if(frontIsClear()) move();
            else{
                turnRight();
                turns++;
            }
        }
    }
    
    private void turnRight(){
        for(int i=0; i<3; i++) turnLeft();
    }
    
    private boolean windowsNeedClosing(int turns){
        if(turns >= 5) return false;
        else return true;
    }
    
    private void closeWindow(){
        turnLeft();
        if(frontIsClear() && !nextToABeeper()) putBeeper();
        turnRight();
    }
}
