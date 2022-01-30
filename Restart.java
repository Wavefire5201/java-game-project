import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Restart extends World
{
    public Restart()
    {
        super(960, 540, 1);
        addObject(new Label("Gameover!", 100), getWidth() / 2, getHeight() / 2);
        addObject(new Label("Push \"P\" to play again.", 55), getWidth() / 2, getHeight() - 180);
        // addObject(new Label("Score: ", 70), getWidth() / 2, getHeight() / 2 - 200);
    }

    public void act() {
        if (Greenfoot.isKeyDown("p")) {
            Greenfoot.setWorld(new MyWorld());
        }

    }
}
