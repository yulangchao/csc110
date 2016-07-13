/**
 * Part1.java
 *
 *
 */
 //ID:V00830514
 //Name:Yingchao Yu

import java.util.Random;
import java.util.Arrays;

public class Part1
{
	/**
	 * There are 6 numbers in each lottery ticket
	 */
	public static final int	TOTAL_NUMBERS = 6;

	/**
	 * The smallest number on the ticket is assumed to be 1
	 */

	/**
	 * The largest number on the ticket is 49
	 */
	public static final int MAX_NUMBER	= 49;

	/**
	 * This method populates the array a with numbers
	 * between MIN_NUMBER and MAX_NUMBER
	 *0
	 * At present, it does not check for duplicates.
	 */
	public static void generate (int[] a)
	{
		/* FIXME: remove duplicates */

		Random r = new Random();

		for (int i=0;i<TOTAL_NUMBERS;i++)
		{
			/**
		 	 * NB: r.nextInt returns a number that is
			 *     >= 0 and < MAX_NUMBER
			 *
			 * So this statement generates a number between 1 and
			 * 49.
			 *
			 * See:
			 * http://java.sun.com/j2se/1.5.0/docs/api/java/util/Random.html
			 */
			a[i] = r.nextInt(MAX_NUMBER)+1;
			
		}
		Arrays.sort(a);
        fix(a);
    }
	//fix duplicate
	public static void fix(int[] a)
	{

	 for (int i=0;i<TOTAL_NUMBERS-1;i++){
	 	if(a[i]==a[i+1]){
	 generate(a);
	 }
	 }

	}
	
	
	
	/**
	 * This method prints all the elements of an array
	 * on one line enclosed in {}.
	 */
	public static void display (int[] n)
	{
		System.out.print("{");
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]);
			if (i!=n.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println("}");
	}

	/**
	 * This method is where the program starts.  It
	 * allocates an array, populates the array
	 * with random numbers, sorts those numbers
	 * and finally displays the contents of the array.
	 */
	public static void main (String[] args)
	{
		int[] theNums = new int[TOTAL_NUMBERS];

		generate(theNums);


		/* This is a utility function from java.util.Arrays
		 * that sorts the contents of the array in
		 * ascending order.
		 */
		Arrays.sort(theNums);

		display(theNums);

	}
}
