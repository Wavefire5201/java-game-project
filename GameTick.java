import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameTick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameTick extends Actor
{
    private int choice;
    private double tick;
    private double time;
    private double spawnTime;
    private int speed;
    public GameTick() {
        GreenfootImage bob = getImage();
        bob.clear();
        speed = 4;
    }

    public void act()
    {
        tick();
        spawnTree();
        increaseSpeed();
    }

    public void spawnTree() {
        if (choice == 1) {
            getWorld().addObject(new tree_short(speed), 1200, 513);
            getWorld().addObject(new hitbox_short(1200, 513, 77, 56, speed), 1200, 513);
            choice = 0;
        } else if (choice == 2) {
            getWorld().addObject(new tree_tall(speed), 1200, 518);
            getWorld().addObject(new hitbox_tall(1200, 518, 94, 110, speed), 1200, 518);
            choice = 0;
        } else if (choice == 3) {
            getWorld().addObject(new tree_thicc(speed), 1200, 520);
            getWorld().addObject(new hitbox_thicc(1200, 520, 130, 122, speed), 1200, 520);
            choice = 0;
        }
    }

    private int tick() {
        if (tick >= 1) {
            choice = (int)(Math.random() * 3) + 1;
            tick = 0;
        } else if (tick <= 1) {
            tick += 0.008;
        }
        return choice;
    }

    private int increaseSpeed() {
        if (spawnTime >= 1) {
            speed +=1 ;
            spawnTime = 0;
        } else if (spawnTime <= 1) {
            spawnTime += 0.002;
        }
        return speed;
    }

}
