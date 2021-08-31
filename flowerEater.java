import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flowerEater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flowerEater extends Actor
{
    private int score; // instance variable declared
    
    
    // default constructor - without parameters
    public flowerEater()
    {
        this.score = 0; 
    }
    /**
     * Act - do whatever the flowerEater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.makeMeMove();
        if ( this.isTouching(Flower.class) == true )
        {
            this.removeTouching(Flower.class);
            this.score = this.score +1;
            World w = this.getWorld();
            w.showText("Score: "+this.score, 50, 20);
            
        }
    }
    
    private void makeMeMove()
    {
        if (Greenfoot.isKeyDown("up") == true)
        {
            this.setRotation(270);
            this.move(4);
        }
        else if (Greenfoot.isKeyDown("down") == true)
        {
            this.setRotation(90);
            this.move(4);
        }
        else if (Greenfoot.isKeyDown("right") == true)
        {
            this.setRotation(0);
            this.move(4);
        }
        else if (Greenfoot.isKeyDown("left") == true)
        {
            this.setRotation(180);
            this.move(4);
        }
    }
}
    

