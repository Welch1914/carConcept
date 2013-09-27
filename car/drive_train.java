
/**
 * Write a description of class drive_train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class drive_train
{
    private String gear;
    private String testGear;
    
    public drive_train()
    {
        gear ="park";
    }
    
    public void changeGears(String newGear)
    {
        testGear = newGear;
        if(testGear == "park")
        {
         gear = testGear;
        }
        
        else if(testGear == "drive")
        {
         gear = testGear;
        }
        
        else if (testGear =="forward")
        {
          gear = testGear;  
        }
        else
        {
            System.out.println("That is not possible. Please select park, forward or reverse");
        }
    }
    
    //returns what gear the transmission is in
    public String getGear()
    {
        return gear;
    }
    
}
