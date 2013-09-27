
/**
 * Write a description of class engine here.
 * 
 * @author Sam Welch/ 200238810 
 * @version 1.0
 */
public class engine
{
    private int oil;
    private boolean engine_status;
    private String transmission;
    
    //sets the initial value of oil, engine_status and transmission
    public engine()
    {
        oil = 100;
        engine_status = false;
        transmission = "park";
    }
    
    //retruns the oil level
    public int oilLevel()
    {
        return oil;
    }
    //subtracks 1 from level to simulate oil consumtion
    public void useOil()
    {
        oil = oil - 1;
    }
    
    //changes the engine_status to true if the engine_status is currently false and vice versa
    public boolean turnKey()
    {
        if ((engine_status == false) )
            {
                engine_status = true;
            }
        else
            {
                engine_status = false;
            }
        return engine_status;
    }
    
    //retruns the current engine_status
    public boolean status()
    {
        return engine_status;    
    }
   
    
}
