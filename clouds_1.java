import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class clouds_1 extends Actor
{   
    private int speed;
    
    public clouds_1() {
        speed = 1;
    }
    
    public void act() {
        setLocation(getX() - 1, getY()); 
        if (getX() <= -480)
        {   
            getWorld().removeObject(this);
            getWorld().addObject(new clouds_1(), 1440, 270);
            
        }
    }
    
    public void setSpeed(int s) {
        speed = s;
    }
}
