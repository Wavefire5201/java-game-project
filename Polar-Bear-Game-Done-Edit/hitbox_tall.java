import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hitbox_tall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hitbox_tall extends Tree
{
    public hitbox_tall(int x, int y, int width, int height) {
        GreenfootImage hitbox = getImage();
        hitbox.clear();
        hitbox.drawRect(x, y, width, height);
    }
    public void act()
    {
        scroll();
    }
}
