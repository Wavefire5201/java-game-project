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
    private boolean result;
    private void Hero()
    {
        velocity = 0;
    }
    
    public void act()
    {
        fall();
        if (Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() - 43)
        jump();
        if (isTouchingTree()) {
            // end game
            getWorld().addObject(new Gameover("Gameover!", 80), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
            
        }
        
    }
    
    private void fall()
    {
        setLocation(getX(), getY() + (int)(velocity));
        if (getY() > getWorld().getHeight() - 43) 
            velocity = 0;
        else
            velocity += gravity;
    }
    
    private void jump()
    {
        velocity = -14;
    }
    
    public boolean isTouchingTree() {
        if (isTouching(hitbox_short.class) || isTouching(hitbox_tall.class) || isTouching(hitbox_thicc.class)) {
            result = true;
        } else { result = false; }
        return result;
    }
}
