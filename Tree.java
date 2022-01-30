import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tree extends Actor
{

    public int time;
    public int speed;

    public Tree()
    {
        speed = 4;
    }

    public Tree(int s)
    {
        speed = s;
    }

    public void scroll(int s)
    {
        setLocation(getX() - s, getY());
        if (getX() <= -30)
        { getWorld().removeObject(this); }
    }

}
