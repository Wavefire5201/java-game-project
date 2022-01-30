import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class hitbox_tall extends Tree
{

    private int speed;

    public hitbox_tall(int x, int y, int width, int height, int s)
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
