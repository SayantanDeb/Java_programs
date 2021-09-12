import java.util.Scanner;
public class SumOfCubes 
{
	 public static void main(String[] args) 
	    {
		 int sum = 0;
		 System.out.println("Enter a number to find the sum of cubes");
	    	Scanner soc = new Scanner(System.in);
	        int num = soc.nextInt();
	        soc.close();
	        for(i=1; i<=num; i++)
	        {
	        	int Sum = sum+(i*i*i);
	        }
	        System.out.printf("The sum of Cubes is: %d", sum);
	        }
}
	 
