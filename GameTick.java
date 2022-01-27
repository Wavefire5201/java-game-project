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
    public GameTick() {
        GreenfootImage bob = getImage();
        bob.clear();
    }
    
    public void act()
    {
        tick();
        spawnTree();
    }
    
    public void spawnTree() {
        if (choice == 1) {
            getWorld().addObject(new tree_short(), 1200, 513);
            getWorld().addObject(new hitbox_short(1200, 513, 77, 56), 1200, 513);
            choice = 0;
        } else if (choice == 2) {
            getWorld().addObject(new tree_tall(), 1200, 518);
            getWorld().addObject(new hitbox_tall(1200, 518, 94, 110), 1200, 518);
            choice = 0;
        } else if (choice == 3) {
            getWorld().addObject(new tree_thicc(), 1200, 520);
            getWorld().addObject(new hitbox_thicc(1200, 520, 130, 122), 1200, 520);
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
}
