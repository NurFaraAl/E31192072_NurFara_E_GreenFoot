import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class mulai extends awal
{
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
