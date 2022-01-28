import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hitbox_thicc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hitbox_thicc extends Tree
{
    public hitbox_thicc(int x, int y, int width, int height) {
        GreenfootImage hitbox = getImage();
        hitbox.clear();
        hitbox.drawRect(x, y, width, height);
    }
    public void act()
    {
        scroll();
    }
}
