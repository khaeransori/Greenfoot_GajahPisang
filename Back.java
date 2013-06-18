import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends World
{
    Counter counter = new Counter("Score: ");    
    private int nyawa = 2;
    
     /**
     * Constructor for objects of class Back.
     * 
     */
    public Back()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        setPaintOrder (ScoreBoard.class, Gajah.class, Pisang.class, Rumput.class, Counter.class);
        populate();
    }
       
    public void act() 
    {
        if(Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Pisang(), Greenfoot.getRandomNumber(600), 10);   
        }
    }    
      
    public void countPop()
    {
        counter.add(20);
    }
    
    public void gameOver() 
    {
        
        if(nyawa == 0) {
            removeObjects(getObjects(Nyawa.class));
            addObject(new ScoreBoard(counter.getValue()), getWidth()/2, getHeight()/2);
            Greenfoot.playSound("buzz.wav");
            Greenfoot.stop();   
        } else {
            if(nyawa == 2) {
                removeObjects(getObjects(Nyawa.class));
                addObject(new Nyawa(), 20,20);
                addObject(new Nyawa(), 40,20);
                
                removeObjects(getObjects(Pisang.class));
                if(Greenfoot.getRandomNumber(100) < 1) {
                    addObject(new Pisang(), Greenfoot.getRandomNumber(600), 10);   
                }
            }
            
            if(nyawa == 1) {
                removeObjects(getObjects(Nyawa.class));
                addObject(new Nyawa(), 20,20);
                
                removeObjects(getObjects(Pisang.class));
                if(Greenfoot.getRandomNumber(100) < 1) {
                    addObject(new Pisang(), Greenfoot.getRandomNumber(600), 10);   
                }
            }
            nyawa--;
        }
    }
    
    private void populate()
    {
        addObject(new Rumput(), 590, 390);
        addObject(new Rumput(), 560, 390);
        addObject(new Rumput(), 530, 390);
        addObject(new Rumput(), 500, 390);
        addObject(new Rumput(), 470, 390);
        addObject(new Rumput(), 440, 390);
        addObject(new Rumput(), 410, 390);
        addObject(new Rumput(), 380, 390);
        addObject(new Rumput(), 350, 390);
        addObject(new Rumput(), 320, 390);
        addObject(new Rumput(), 290, 390);
        addObject(new Rumput(), 260, 390);
        addObject(new Rumput(), 230, 390);
        addObject(new Rumput(), 200, 390);
        addObject(new Rumput(), 170, 390);
        addObject(new Rumput(), 140, 390);
        addObject(new Rumput(), 110, 390);
        addObject(new Rumput(), 80, 390);
        addObject(new Rumput(), 50, 390);
        addObject(new Rumput(), 20, 390);
        
        addObject(new Gajah(), 300,380);
        
        addObject(counter, 500, 20);
        
        addObject(new Nyawa(), 20,20);
        addObject(new Nyawa(), 40,20);
        addObject(new Nyawa(), 60,20);
    } 
    
    
}
