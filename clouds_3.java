import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clouds_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clouds_3 extends Actor
{
    /**
     * Act - do whatever the clouds_3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() - 2, getY()); 
        if (getX() <= -480)
        {   
            getWorld().addObject(new clouds_3(), 1440, 270);
            getWorld().removeObject(this);
        }
    }
}
