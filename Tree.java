import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree extends Actor
{
    public int time;
    public int speed;

    public Tree() {
        speed = 4;
    }

    public Tree(int s) {
        speed = s;
    }
    public void act()
    {
        //increaseSpeed();
    }

    public void scroll(int s) {
        setLocation(getX() - s, getY());
        if (getX() <= -30)
        {
            getWorld().removeObject(this);
        }

      }

    // public void increaseSpeed() {
    //     if (time >= 1) {
    //         speed += 10;
    //         time = 0;
    //     } else if (time <= 1) {
    //         time += 0.1;
    //     }
    //
    // }
}
