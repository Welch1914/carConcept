
/**
 * Write a description of class body here.
 * 
 * @author Sam Welch 
 * @version 1.0
 */
public class body
{
    private boolean doors;
    
    // constructs variable doors as false(closed) 
    public body()
    {
        doors = false;
    }
    //sets doors to true, if false, and returns doors value(false is closed, true is open)
   public void useDoors()
    {
        if (doors == false)
            {
                doors = true;
            }
         else
         {
             doors = false;
            }
    }
   
    //returns status of doors
    public boolean status()
    {
        return doors;
    }
}
