
/**
 * Cureenlty decidning the number of bugs should be produced and annilated.
 *
 * @author (Markintus morris )
 * @version (2/16/21)
 */
public class Bug
{
   //instance varibles - replace the example below with your own
   private int bugNum;
   
   /**
    * 
    * Constructor of objects of class Bug
    */
   public Bug(int bN)
   {
       //initalize baribles
       bugNum=bN;
    }
    
    /**
     * stimulate the multiplication of bugs
     * 
     * @param y none 
     * @return none 
     */
    public void breedBugs()
    {
       //multiply our bugs by 2
       bugNum = bugNum * 2;
    }
    
    /**
     * stimulate spraying of these bugs 
     * 
     * @param y none 
     * @return    none 
     */
    public void sprayBugs()
    {
       //multiply our bugs by .75
        bugNum = (int)(bugNum * .75);
    }
    
    /**
     * will retunr the number of bugs 
     * 
     * @param y none 
     * @return int number of bugs
     */
    public int getBugs()
    {
      return bugNum;
    }
}
