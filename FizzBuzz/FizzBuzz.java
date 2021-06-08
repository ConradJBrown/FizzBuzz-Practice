//Java Program to run FizzBuzz Practice
import java.util.*;

class FizzBuzz
{
	public static void main(String args[])
	{
		int fizzbuzz = 100;
		
		//loop that counts to 100
		for (int i = 1; i <= fizzbuzz; i++)
		{
			//Numbers divisible by 15
			//Print FizzBuzz
			if (i % 15 == 0)
				System.out.print("FizzBuzz"+" ");
			
			//Numbers divisible by 5
			//print Buzz
			else if (i % 5 == 0)
				System.out.print("Buzz"+" ");
			
			//Numbers divisible by 3
			//print Fizz 
			else if (i % 3 == 0)
				System.out.print("Fizz"+" ");
			
			//Print the rest of the numbers
			else
				System.out.print(i+" ");
			
		}
	}
}