import java.util.Scanner;
public class GCD  
{ 
	public static void main(String[] args)   
	{  
		System.out.println("Enter two numbers");
		Scanner g = new Scanner(System.in);
		int x = g.nextInt();
		int y = g.nextInt();
		g.close();
		int gcd = 1;  
		for(int i = 1; i <= x && i <= y; i++) 
		{  
			if(x%i==0 && y%i==0)  
				gcd = i;  
			}  
		System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
		}  
	}  