import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
    	System.out.println("Enter a number to find the Multiplication Table");
    	Scanner table = new Scanner(System.in);
        int number = table.nextInt();
        table.close();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
    }
}