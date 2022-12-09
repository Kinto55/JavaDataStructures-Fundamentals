
/**
 *  We are seeing how many of our bugs will be left, co exist .
 *
 * @author (Markintus Morris )
 * @version (a version number or a date)
 */
public class BugTester
{
    public static void mains(String [] args)
    {
       //Create object with an inital count of 10 bugs
       Bug bg = new Bug(10);
       bg.breedBugs();
       bg.sprayBugs();
       bg.sprayBugs();
       bg.sprayBugs();
       System.out.println("The number of  bugs after round 1 is: " + bg.getBugs());
       //Breed and spray 2
       bg.breedBugs();
       bg.sprayBugs();
       bg.sprayBugs();
       bg.sprayBugs();
       System.out.println("The number of  bugs after round 2 is: " + bg.getBugs());
       bg.breedBugs();
       bg.sprayBugs();
       bg.sprayBugs();
       bg.sprayBugs();
       System.out.println("The number of  bugs after round 3 is: " + bg.getBugs());             
    }
}
