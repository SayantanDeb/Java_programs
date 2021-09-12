import java.util.Scanner;
public class SwapingOfTwoNumbers 
{
	public static void main(String[] args) 
	{
	        System.out.println("Enter the value of numbers you want to swap");  //Display for the user 

	        Scanner userInput = new Scanner(System.in);  //input is taken by the user

	        int FirstNumber = userInput.nextInt();  //first number is stored here

	        int SecondNumber = userInput.nextInt(); //Second number is stored here
 
	        userInput.close(); //close the function

	        System.out.println("Before swapping, First Number: "+FirstNumber +" Second Number: "+ SecondNumber); //Print the numbers before Swapping
 
	        FirstNumber = FirstNumber + SecondNumber;   //Swapping of numbers takes place
	        SecondNumber = FirstNumber - SecondNumber;   
	        FirstNumber = FirstNumber - SecondNumber;   

	        System.out.println("After swapping, First Number:  "+FirstNumber+" Second Number:  " + SecondNumber); //Print the numbers after Swapping
	}
}