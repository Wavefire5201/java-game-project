import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tree_short here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tree_short extends Tree
{
    // dim = 40x28
    /**
     * Act - do whatever the tree_short wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public tree_short() {
        GreenfootImage bob = getImage();
        bob.scale(bob.getWidth() * 2, bob.getHeight() * 2);
    }
    public void act()
    {
        scroll();
    }
}
