import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends Actor
{
    /**
     * Act - do whatever the SplashScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("Selamat Datang!",50, Color.BLUE, Color.PINK));
         Greenfoot.delay(50);
         if (Greenfoot.mouseClicked (this))
        {
            setImage(new GreenfootImage("Selamat Datang!",50, Color.BLUE, Color.PINK));
             getWorld().removeObject(this);
             Greenfoot.delay(0);
        }
      //getWorld().removeObject(this);
       // Greenfoot.delay(0);
        
       
    }  
}
