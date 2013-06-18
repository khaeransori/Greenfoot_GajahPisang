import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gajah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Gajah extends Actor
{
   
    /**
     * Act - do whatever the Gajah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), 380);
        }
        
        if(foundPisang()){
            eatPisang();
        }
    }
    
    public boolean foundPisang(){
        Actor Pisang = getOneObjectAtOffset(0, 0, Pisang.class);
        if(Pisang!=null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void eatPisang(){
        Actor Pisang = getOneObjectAtOffset(0, 0, Pisang.class);
        if(Pisang!=null){
            Greenfoot.playSound("pop.wav");
            ((Back) getWorld()).countPop();
            getWorld().removeObject(Pisang);
        }
    }
}
    