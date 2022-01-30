import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class hitbox_short extends Tree
{

    private int speed;

    public hitbox_short(int x, int y, int width, int height, int s)
    {
        GreenfootImage hitbox = getImage();
        hitbox.clear();
        hitbox.drawRect(x, y, width, height);
        speed = s;
    }

    public void act()
    {
        scroll(speed);
    }

}
