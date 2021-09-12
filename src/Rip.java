import java.util.Scanner;
public class Rip 
{
    public static void main(String[] args) 
    {
    System.out.print("Enter the amount in Rupees: ");	
    Scanner s = new Scanner(System.in);
    float f = s.nextFloat();
    s.close();
    System.out.print("The amount in paise is: ");
    System.out.print((int)(f*100));
    }
}