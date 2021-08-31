import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    private int turnCount;
    public Flower()
    {
        GreenfootImage gfi = new GreenfootImage("cactus.png");
        gfi.scale( 65, 65 ); 
        this.setImage( gfi ); // gfi is freed up
    }
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.turn(5);
        this.turnCount++;
        if (this.turnCount == 360)
        {
            World w = this.getWorld();
            w.removeObject(this);
        }
    }
}
