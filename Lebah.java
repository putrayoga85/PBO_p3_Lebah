import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lebah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lebah extends Actor
{
    /**
     * Act - do whatever the Lebah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
       //menggerakkan lebah
        move(10);
        if (Greenfoot.isKeyDown("up"))
        {
               turn(50); 
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
               turn(20); 
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
               turn(3); 
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
               turn(50); 
        }
        
        if(isAtEdge())
        {
            turn(90);
        }  
    
        Actor Tulip=(Tulip)getOneIntersectingObject(Tulip.class);
        if(Tulip!=null)
        {
            getWorld().removeObject(Tulip);
            Dunia dunia = (Dunia)getWorld();
            Counter counter = dunia.getCounter();
            counter.addCounter();
            getWorld().addObject(new Tulip(),10,Greenfoot.getRandomNumber(400));
        }
        
        Actor Bola=(Bola)getOneIntersectingObject(Bola.class);
        if(Bola!=null)
        {
            getWorld().removeObject(Bola);
            Dunia dunia = (Dunia)getWorld();
            Nyawaku nyawaku = dunia.getNyawaku();
            nyawaku.minNyawaku();
            getWorld().addObject(new Bola(),10,Greenfoot.getRandomNumber(400));
        }
    }
}