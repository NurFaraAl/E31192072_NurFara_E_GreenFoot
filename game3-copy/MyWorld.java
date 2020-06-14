import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 public class MyWorld extends World
 {
    public MyWorld()
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
        lala lala = new lala();
        addObject(lala,216,35);
        lala lala2 = new lala();
        addObject(lala2,288,36);
        lala2.setLocation(288,35);
        lala lala3 = new lala();
        addObject(lala3,360,35);
        lala lala4 = new lala();
        addObject(lala4,216,106);
        lala lala5 = new lala();
        addObject(lala5,288,106);
        lala lala6 = new lala();
        addObject(lala6,360,107);
        lala lala7 = new lala();
        addObject(lala7,216,178);
        lala lala8 = new lala();
        addObject(lala8,287,178);
        lala lala9 = new lala();
        addObject(lala9,359,178);
        lala lala10 = new lala();
        addObject(lala10,216,249);
        lala lala11 = new lala();
        addObject(lala11,287,249);
        lala lala12 = new lala();
        addObject(lala12,358,250);
        lala lala13 = new lala();
        addObject(lala13,216,321);
        lala lala14 = new lala();
        addObject(lala14,287,321);
        lala lala15 = new lala();
        addObject(lala15,358,322);
        lala lala16 = new lala();
        addObject(lala16,357,365);
        lala lala17 = new lala();
        addObject(lala17,285,364);
        lala lala18 = new lala();
        addObject(lala18,212,365);
        lala18.setLocation(216,365);
        lala14.setLocation(280,356);
        car car = new car();
        addObject(car,280,356);
        lala lala19 = new lala();
        addObject(lala19,288,297);
        lala14.setLocation(288,336);
        removeObject(car);
        lala14.setLocation(278,355);
        car car2 = new car();
        addObject(car2,278,355);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new bomb(), Greenfoot.getRandomNumber(200) +200, 0);
        }
        
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new coin(), Greenfoot.getRandomNumber(200) +200, 0);
        }
    }
}
