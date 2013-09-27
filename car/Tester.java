
/**
 * Write a description of class Tester here.
 * 
 * @author Sam Welch 
 * @version 1.0
 */
public class Tester
{
    private car ford;
    
    public Tester()
    {
     ford = new car();   
    }
    //returns petrol level
    public int getPetrolLevel()
    {
      return ford.getPetrolLevel();  
    }
    //resets petrol levels to 100
    /**
     * Engine must be off.
     */
    public void refuel()
    {
        ford.refuelCar();
    }
    //returns level of oil 
    public int getOilLevel()
    {
         return ford.getOilLevel();
    }
    
    //turns on engine
    /**
     * Gear must be in park, engine must be off must have sufficant oil(>5) and petrol(>10).
     */
    public void startEngine()
    {
        ford.turnOnCar();
    }
    //turns off engine
     /**
     * Gear must be in park, engine must be on).
     */
    public void stopEngine()
    {
        ford.turnOffCar();
    }
    //retruns engine status
    public boolean engineStatus()
    {
        return ford.engineStatus();
    }
    //checks status of doors
    public boolean doorStatus()
    {
        return ford.doorStatus();
    }
    //opens or closes doors, depending on what they cureently are
    public void useDoors()
    {
       ford.useDoors(); 
    }
    //moves car forward of backwrd depending on status
   /**
     * Car must not be moving, engine must be on and, doors must be closed.
     */
    public void move()
    {
        ford.move();
    }
    //stops car
    public void stopCar()
    {
        ford.stopCar();
    }
     //changes gears
    /**
     * Valid gears are "park", "drive", and "reverse".
     */
    public void changeGears(String newGear)
    {
        ford.changeGears(newGear);
    }
    
    //returns what gear the transmission is in
    public String getGear()
        {
            return ford.getGear();
        }
}
