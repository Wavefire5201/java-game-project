import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class tree_short extends Tree
{

    private int speed;

    public tree_short(int s)
    {
        speed = s;
        GreenfootImage bob = getImage();
        bob.scale(bob.getWidth() * 2, bob.getHeight() * 2);
    }

    public void act()
    {
        scroll(speed);
    }

}
