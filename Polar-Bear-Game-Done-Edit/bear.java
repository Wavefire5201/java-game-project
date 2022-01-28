import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bear extends Actor
{
    private final double gravity = 0.5;
    private double velocity;
    private double value;
    private boolean result;
    private void Hero()
    {
        velocity = 0;
    }
    public bear() {
        GreenfootImage bob = getImage();
        bob.scale(bob.getWidth() * 3, bob.getHeight() * 3);
    }
    public void act()
    {
        fall();
        right();
        left();
        if (Greenfoot.isKeyDown("space")&& getY() > getWorld().getHeight() - 50)
        jump();
        if (isTouchingTree()) {
            // end game
            getWorld().addObject(new Gameover("Gameover!", 80), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
            // if (Greenfoot.isKeyDown("y")) {
            //     Greenfoot.setWorld(new MyWorld());
            //
            // } else if (Greenfoot.isKeyDown("n")) {
            //     Greenfoot.stop();
            //
            // }
        }

    }

    private void fall()
    {
        setLocation(getX(), getY() + (int)(velocity));
        if (getY() > getWorld().getHeight() - 50)
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

    private void right()
    {
       if(Greenfoot.isKeyDown("d"))
       {
           setLocation(getX()+3,getY());
       }
    }

    private void left()
    {
       if(Greenfoot.isKeyDown("a"))
       {
           setLocation(getX()-3,getY());
       }
    }

}
