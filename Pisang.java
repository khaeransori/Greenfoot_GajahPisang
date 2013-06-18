import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pisang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pisang extends Actor
{
    /**
     * Act - do whatever the Pisang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        setLocation(getX(), getY() +1);
        if (getY() == 390) {
            ((Back) getWorld()).gameOver();
        }
    }
}
