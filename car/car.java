
/**
 * Write a description of class car here.
 * 
 * @author Sam Welch/ 200238810 
 * @version 1.0
 */
public class car
{
   //connect to all sub-objects
   private body chassis;
   private engine eng;
   private drive_train drive;
   private gas_tank tank;
   private boolean move;
   // sets the names of created objects
   public car()
   {
       move = false;
       tank = new gas_tank();
       eng = new engine();
       chassis = new body();
       drive = new drive_train();
   }
   
    // retruns the level of petrol in the tank as given by tank
    public int getPetrolLevel()
    {
       return tank.getLevel(); 
    }
    //resets petrol levels to 100
  /**
     * Engine must be off.
     */
    public void refuelCar()
   {
       if (eng.status() == false)
       {
           tank.refuel();
        }
        else
        {
            System.out.println("Please turn off engine");
        }
    }
    
    //retruns the level of oil in the engine as given by eng
    public int getOilLevel()
    {
         return eng.oilLevel();
    }
   
    //tells eng to run start and change engine status to true, if false, or vice versa. Value is then returned(should always be true) 
    /**
     * Gear must be in park, engine must be off must have sufficant oil(>5) and petrol(>10).
     */
    public void turnOnCar()
    {
        if ((drive.getGear() == "park") &&(eng.oilLevel() > 5)&&(tank.getLevel() > 10) && (eng.status() == false))
        eng.turnKey();
       
    }
    /**
     * Gear must be in park, engine must be on).
     */
    public void turnOffCar()
    {
        if ((drive.getGear() == "park")&&(eng.status() == true))
        eng.turnKey();
       
    }
    //returns engine status as given by eng
    public boolean engineStatus()
    {
        return eng.status();
    }
    //tells chassis to run open and change the value of doors to true, if false, or vice wersa . Value is then returned(shold always be true)
    public void useDoors()
    {
        chassis.useDoors();
    }
   // retruns the status of doors as given by chassis
    public boolean doorStatus()
    {
        return chassis.status();
    }
    
    // cehcks to see if the car can move, and if requirements are met, it starts moving
    /**
     * Car must not be moving, engine must be on and, doors must be closed.
     */
    public void move()
    {
        if((move == false)&&(drive.getGear() == "drive") &&(eng.status() == true) &&(chassis.status() == false))
        {
            move = true;
            tank.usePetrol();
            eng.useOil();
            System.out.println ("The car is moving forward.");
        }
        else if((move == false)&&(drive.getGear() == "reverse") &&(eng.status() == true) &&(chassis.status() == false))
        {
          move = true;
            tank.usePetrol();
            eng.useOil();
            System.out.println ("The car is moving backward.");  
        }
        else
        {
            System.out.println ("You have not moved. Check engine status, petrol levels, gear and oil levels.");
        }
    }
    
    // checks to see if the car is moving or not, then either stops the car, 
    // or it informs the user that the car is already stopped  
    public void stopCar()
    {
        if (move == true)
        {
            move = false;
            System.out.println ("The car has stopped");
        }
        else
        {
                System.out.println ("The car is already stopped.");
        }
    }
    //changes gears
    /**
     * Valid gears are "park", "drive", and "reverse".
     */
    public void changeGears(String newGear)
    {
        if ((move == false) && eng.status() == true)
        {
            drive.changeGears(newGear);
        }
        else
        {
            System.out.println("Please make sure car is not moving and engine is on");
        }
    }
    //returns what gear the transmission is in
    public String getGear()
        {
            return drive.getGear();
        }
}
