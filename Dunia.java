import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dunia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{
   Counter counter = new Counter();
   Nyawaku nyawaku = new Nyawaku();
   Waktu waaktu = new Waktu();
    /**
     * Constructor for objects of class Dunia.
     * 
     */
    public Dunia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare_tulip();
        prepare_bola_dan_lebah();
        addObject(new SplashScreen(),300,200);
        //Greenfoot.delay();
        
        
    }
    
    public Counter getCounter()
    {
        return counter;
    }
    
    public Nyawaku getNyawaku()
    {
        return nyawaku;
    }
    
    private void prepare_tulip()
    {
        addObject(counter, 100,40);
        Tulip tulipX = new Tulip();
        addObject(tulipX, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        Tulip tulipY = new Tulip();
        addObject(tulipY, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        Tulip tulipZ = new Tulip();
        addObject(tulipZ, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }
    
    private void prepare_bola_dan_lebah()
    {
       addObject(nyawaku, 500,50);
       Lebah Lebah = new Lebah();
       addObject(Lebah, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
       Bola bolaZ = new Bola();
       addObject(bolaZ, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
       //Bola bolaY = new Bola();
       //addObject(bolaY, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
       //Bola bolaX = new Bola();
       //addObject(bolaX, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }
}