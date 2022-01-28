import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocks_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocks_2 extends Actor
{
    /**
     * Act - do whatever the rocks_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() - 4, getY()); 
        if (getX() <= -480)
        {   
            //getWorld().addObject(new rocks_2(), 1440, 270);
            //getWorld().removeObject(this);
            setLocation(1440, 270);
        }
    }
}
