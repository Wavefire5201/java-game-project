import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels. world bound = false
        super(960, 540, 1, false);
        setActOrder(clouds_1.class, clouds_2.class, rocks_1.class, clouds_3.class, rocks_2.class, clouds_4.class, Tree.class, Seal.class);
        addObject(new clouds_1(), 480, 270);
        addObject(new clouds_1(), 1440, 270);
        addObject(new clouds_2(), 480, 270);
        addObject(new clouds_2(), 1440, 270);
        addObject(new rocks_1(), 480, 270);
        addObject(new rocks_1(), 1440, 270);
        addObject(new clouds_3(), 480, 270);
        addObject(new clouds_3(), 1440, 270);
        addObject(new rocks_2(), 480, 270);
        addObject(new rocks_2(), 1440, 270);
        addObject(new clouds_4(), 480, 270);
        addObject(new clouds_4(), 1440, 270);
        addObject(new Seal(), 100, 480);
        addObject(new Label("Score: ", 50), 100, 50);
        addObject(new ScoreInt(0, 50), 180, 50);
        //addObject(new tree_short(), 990, 500);
        //addObject(new tree_tall(), 1050, 485);
        //addObject(new tree_thicc(), 1150, 480);
        addObject(new GameTick(), 0, 0);
    }
}
