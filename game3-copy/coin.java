import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class coin extends other
{
    int speed = 7;
    public void act() 
    {
        coin a = new coin();
        Actor i = getOneIntersectingObject(coin.class);
        move(speed);
        checkdouble(i);
        end();
    }    
}
