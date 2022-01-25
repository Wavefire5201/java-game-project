import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seal extends Actor
{
    private final int gravity = 1;
    private int velocity;
    private int value;
    private void Hero()
    {
        velocity = 0;
    }
    
    public void act()
    {
        fall();
        if (Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() - 60)
        jump();
        
    }
    
    private void fall()
    {
        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 60) 
            velocity = 0;
        else
            velocity += gravity;
    }
    
    private void jump()
    {
        velocity = -15;
    }
    
    private boolean isTouchingWall() {
        if (isTouching(Wall.class)) {
            return true;
        } else {
            return false;
        }
    }
}
