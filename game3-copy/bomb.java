import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bomb extends other
{
    int speed = 5;
    public void act() 
    {
        bomb a = new bomb();
        Actor i = getOneIntersectingObject(bomb.class);
        move(speed);
        checkdouble(i);
        end();
    }    
}
