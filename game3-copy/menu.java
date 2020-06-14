
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class menu extends World
{
    
     public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }

     /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mulai mulai = new mulai();
        addObject(mulai,311,59);
        startbutton startbutton = new startbutton();
        addObject(startbutton,474,301);
        startbutton.setLocation(284,230);
    }
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MyWorld());
        }
        
    }
}
