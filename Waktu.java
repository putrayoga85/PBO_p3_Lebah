import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Waktu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Waktu extends Actor
{
    /**
     * Act - do whatever the Waktu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    public void act() 
    {
        setImage(new GreenfootImage("Waktu : " +timer, 25, Color.RED, Color.GRAY));
        
    }   
    
    public void waktu()
    {
        if(timer>0)
        {
            timer--;
        }else
            Greenfoot.stop();
    }    
}
