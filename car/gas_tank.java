
/**
 * Write a description of class gas_tank here.
 * 
 * @author Sam Welch 
 * @version 1.0
 */
public class gas_tank
{
    private int level;
    
    // sets the level of petrol to 100
    public gas_tank()
    {
        level = 100;
    }
    
    //returns current level of petrol in gas_tank to the user
    public int getLevel()
    {
        return level;
    }
    //subtracks 10 from level to simulate petrol consumtion
    public void usePetrol()
    {
        level = level - 10;
    }
    //resets petrol levels to 100
    public void refuel()
    {
        level = 100;
    }
}
