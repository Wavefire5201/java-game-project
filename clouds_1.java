import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class clouds_1 extends Actor
{   
    
    public void act() {
        setLocation(getX() - 1, getY()); 
        if (getX() <= -480)
        {   
            
            
            setLocation(1440, 270);
        }
    }
}
