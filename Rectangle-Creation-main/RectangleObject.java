
/**
 * We are going to practice making objects 
 * using Rectangle
 *
 * @author (Markintus Morris)
 * @version (2/2/21)
 */
import java.awt.Rectangle;
public class RectangleObject
{
  public static void main(String[] args)
  {
      // creating my rectangle object
      Rectangle box= new Rectangle(5,20,30,35);
      // create varible to hold width and height 
      double width;
      double height;
      // get my width and height
      // accessor methods
      width = box.getWidth();
      height = box.getHeight();
      // Print the results
      System.out.println("Width = " + width);
      System.out.println("Height = " + height);
      // translate the location of the rectangle 
      // mutator method
      box.translate(10,15);
      System.out.println("X is " + box.getX());
      System.out.println("Y is " + box.getY());
      
      
      
      
    }
}
