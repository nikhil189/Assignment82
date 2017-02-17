/**
 * 
 */
package acadglidAssignment;

import java.util.Scanner;

/**
 * @author nikhil13686
 *
 */
public class PrintAge {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- 
	 * Return Type - void
	 */
	public static void main(String[] args)
	{
		try
		{
	     Scanner objScanner = new Scanner(System.in);  //Declaring Scanner variable to take input from user
	     
         System.out.println("Enter Your Age");

         int age = objScanner.nextInt();         //Taking input from user
         objScanner.close();
         try
         {
             if(age < 0)
             {
                 throw new NegativeAgeException("Age can not be negative");    //throws NegativeAgeException if age is negative
             }
         }
         catch(NegativeAgeException ex)
         {
             System.out.println(ex);    //Output : Age can not be negative
         }
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}
	}

}
