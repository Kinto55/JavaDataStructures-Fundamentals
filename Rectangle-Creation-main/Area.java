
/**
 * We are going to practice making objects 
 * using Rectangle
 *
 * @author (Markintus Morris)
 * @version (2/2/21)
 */
import java.awt.Rectangle;
public class Area
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
 
      // Calculate the area of the rectangle 
      double area = width * height;
      
      //print width, height, and area
      System.out.println("width is " + width);
      System.out.println("height is " + height);
      System.out.println("Area is " + area);
      
      
    }
}


