import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seal extends Actor
{
    private final double gravity = 0.5;
    private double velocity;
    private double value;
    private void Hero()
    {
        velocity = 0;
    }
    
    public void act()
    {
        fall();
        left();
        right();
        death();
        if (Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() - 60)
        jump();
        
    }
    
    private void fall()
    {
        setLocation(getX(), getY() + (int)(velocity));
        if (getY() > getWorld().getHeight() - 60) 
            velocity = 0;
        else
            velocity += gravity;
    }
    
    private void jump()
    {
        velocity = -16;
    }
    
    private void right()
    {
       if(Greenfoot.isKeyDown("right"))
       {
           setLocation(getX()+3,getY());
       }
    }
    
    private void left()
    {
       if(Greenfoot.isKeyDown("left"))
       {
           setLocation(getX()-3,getY());
       }
    }
    
    private void death()
    {
        if(getOneIntersectingObject(tree_short.class)!=null||getOneIntersectingObject(tree_tall.class)!=null||getOneIntersectingObject(tree_thicc.class)!=null)
        {
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    
    //private boolean isTouchingTree() {
        //if (isTouching(tree_short.class)) {
            //return true;
        //} else {
            //return false;
        //}
    //}
}
