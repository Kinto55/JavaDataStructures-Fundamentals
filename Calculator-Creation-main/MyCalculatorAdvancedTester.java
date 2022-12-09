
/**
 * FOr out advanced MyCalculatorAdvancedTester here.
 *
 * @author (Markitnus Morris)
 * @version (2/16/21)
 */
import java.util.Scanner;
public class MyCalculatorAdvancedTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        MyCalculatorAdvanced morrisCal = new MyCalculatorAdvanced();
       
        System.out.println("Enter the value(integer) of X: ");
        int x = input.nextInt();
        System.out.println("Enter the value(integer) of Y: ");
        int y = input.nextInt();
        System.out.println("Enter the value(integer) of Z: ");
        int z = input.nextInt();
        
        int total;
        
        total = x + y;
        
        morrisCal.add(x,y);
        morrisCal.getTotal();
        morrisCal.subtract(total,z);
        morrisCal.getTotal();
        
        System.out.println("The following output is from integers: ");
        System.out.println("x + y - z = " + morrisCal.getTotal());
        
        morrisCal.clearTotal();
        
        total = x * y;
        
        morrisCal.multiply(x,y);
        morrisCal.getTotal();
        morrisCal.add(total,z);
        morrisCal.getTotal();
        
        System.out.println("The following output is from integers: ");
        System.out.println("x * y + z = " + morrisCal.getTotal());
        
        morrisCal.clearTotal();
        
        System.out.println("Enter the value(double) of XD: ");
        double xd = input.nextDouble();
        System.out.println("Enter the value(double) of YD: ");
        double yd = input.nextDouble();
        System.out.println("Enter the value(double) of ZD: ");
        double zd = input.nextDouble();
        
        double totalD;
        
        totalD = xd + yd;
        
        morrisCal.add(xd,yd);
        morrisCal.getTotalD();
        morrisCal.subtract(totalD,zd);
        morrisCal.getTotalD();
        
        System.out.println("The following output is from doubles: ");
        System.out.println("xd + yd - zd = " + morrisCal.getTotalD());
        
        totalD = xd * yd;
        
        morrisCal.multiply(xd,yd);
        morrisCal.getTotalD();
        morrisCal.add(totalD,zd);
        morrisCal.getTotalD();
        
        System.out.println("The following output is from doubles: ");
        System.out.println("xd * yd + zd = " + morrisCal.getTotalD());
    }
}
