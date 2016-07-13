/**
 * LotteryTicket.java
 *
 * Complete this class for Part 2 of Assignment 1.
 */
 //ID:V00803514
 //Name:Yingchao Yu

import java.util.Random;
import java.util.Arrays;

public class LotteryTicket
{
    /**
	 * There are 6 numbers in each lottery ticket
	 */
	private final int TOTAL_NUMBERS	= 6;

	/**
	 * The smallest number on the ticket is assumed to be 1
	 * The largest number on the ticket is 49
	 */
	private final int MAX_NUMBER = 49;

	/* FIXME: Include all necessary instance variables for a lottery ticket. */

    private  int[] a=new int[TOTAL_NUMBERS];

	/**
	 * This is the General Constructor. It should initialize and populate the
	 * lottery number into the array.
	 */
	public LotteryTicket()
	{
		/* FIXME: Fill in the necessary functionality in this method to create an
		 * array full of random numbers and sort it in ascending order - see Part I
		 * for guidance.
		 */
	

		generate(this.a);


		Arrays.sort(this.a);


	}

	/**
	 * This method populates the array a with numbers
	 * between MIN_NUMBER and MAX_NUMBER and ensures there are no duplicate numbers.
	 */
	private void generate (int[] a)
	{
		Random r = new Random();
        
		for (int i=0;i<this.TOTAL_NUMBERS;i++)
		{
        	/* FIXME: Complete the generate method. It should be very similar to the generate
        	 * method used in Part 1.
        	 */
        	 a[i] = r.nextInt(MAX_NUMBER)+1;
		}
		Arrays.sort(a);
        fix(a);
    }
	//fix duplicate
	private void fix(int[] b)
	{

	 for (int i=0;i<b.length-1;i++){
	 	if(b[i]==b[i+1]){
	 generate(b);
	 }
	 }

	}
	/**
	 * This method should return the numbers in the lottery ticket as a printable String,
	 * in the same format as the one used by the display method in Part 1.
	 */
	public String toString()
	{
		/* FIXME: */
	
		return "{"+this.a[0]+","+this.a[1]+","+this.a[2]+","+this.a[3]+","+this.a[4]+","+this.a[5]+"}";
	}

	/**
	 * This method compares two sets of LotteryTicket and returns a boolean (true or false)
	 * indicating whether they match. LotteryDraw uses this method to determine if it has found a
	 * winning ticket, so it is very important that it function properly.
	 */
	public boolean matches(LotteryTicket other)
	{
		/*
		 * Based on the logic of this lottery program we know that for each Lottery Ticket:
		 * 1) all numbers are sorted lowest to highest
		 * 2) No numbers are the same
		 *
		 */

		/* FIXME: */
		boolean a=true;
	 for (int i=0;i<this.a.length-1;i++){
	 	if(this.a[i]!=other.a[i]){
			a=false;
			break;			
		}else{
			a=true;
		}
		}
		return a;
}
}
