import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntroWorld extends World
{

    /**
     * Constructor for objects of class IntroWorld.
     *
     */
    public IntroWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1);

    }

    public void act() {
        if (Greenfoot.isKeyDown("p")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
