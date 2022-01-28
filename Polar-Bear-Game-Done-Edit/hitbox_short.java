import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hitbox_short here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hitbox_short extends Tree
{
    public hitbox_short(int x, int y, int width, int height) {
        GreenfootImage hitbox = getImage();
        hitbox.clear();
        hitbox.drawRect(x, y, width, height);
    }
    /**
     * Act - do whatever the hitbox_short wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        scroll();
    }
}
