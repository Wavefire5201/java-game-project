import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tree_tall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tree_tall extends Tree
{
    // dim = 47x55
    public tree_tall() {
        GreenfootImage bob = getImage();
        bob.scale(bob.getWidth() * 2, bob.getHeight() * 2);
    }

    /**
     * Act - do whatever the tree_tall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        scroll();
    }
}
