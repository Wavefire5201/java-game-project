import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clouds_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clouds_4 extends Actor
{
    /**
     * Act - do whatever the clouds_4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() - 3, getY()); 
        if (getX() <= -480)
        {   
            getWorld().addObject(new clouds_4(), 1440, 270);
            getWorld().removeObject(this);
        }
    }
}
