//Write a Java program that only uses 1 variable to print to the screen the decimal values from 1.0 to 2.0 in 0.1 .

import java.text.DecimalFormat;

public class Decimals{

	public static void main(String args[]){
		DecimalFormat df=new DecimalFormat("#.0");
		for(double i=1; i<=2.1; i=i+0.1){
			
			System.out.println(df.format(i));
   
		}
		
	}
}