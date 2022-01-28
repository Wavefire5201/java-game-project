import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree extends Actor
{

    private int speed;
    private int time;
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tree() {
        speed = 6;
        time = 0;
    }
    public void act()
    {
        increaseSpeed();
    }

    public void scroll() {
        setLocation(getX() - speed, getY());
        if (getX() <= -30)
        {
            getWorld().removeObject(this);
        }

    }

    public void increaseSpeed() {
        if (time >= 1) {
            speed += 10;
            time = 0;
        } else if (time <= 1) {
            time += 0.05;
        }
        
    }
}
