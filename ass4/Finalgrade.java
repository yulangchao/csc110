//Name:Yingchao Yu
//ID:V00830514


import java.util.Scanner;
import java.io.*;

public class Finalgrade	 {
	public static void main(String[] args) {
	  System.out.println("C O U R S E G R A D E C A L C U L A T O R");
	  System.out.println(" Author: L. Jackson October 2010 update May 2011" );
      System.out.println(" Purpose: Calculated the weighted grade for a student in a course" );
      System.out.println("    Inputs: Assignment, Lab, Quiz and Exam grades ");
	  System.out.println();
	  
	  Scanner Grade= new Scanner(System.in);
	  Scanner Id= new Scanner(System.in);
	  //input final grade
	  System.out.print("Passing Grade for Final ==>");
	  double a=Grade.nextInt();
	  System.out.println();
	  //input id No.
	  System.out.print("Input ID number ==>");
	  int b=Id.nextInt();
	  System.out.println();
	  

     double c=getscore("Assignments",20,8);
     	System.out.println();
     double d=getscore("Lab Attendance",5,1);
		System.out.println();
     double e=getscore("quiz",20,1);
		System.out.println();
     double f=getscore("Midterm",100,1);
		System.out.println();
     double g=getscore("Final Exam",100,1);
		System.out.println();
	 double h=0;
	 
	 //calculate marks
     h=(c/160*24)+d+(e/20*3)+(f/100*23)+(g/100*45);
     String k;
     //converted to a letter grade
         if(h>=96.5){
         	k="A+";
         }else if(h>=92.5){
         	k="A";
         }else if(h>=87.5){
         	k="A-";
         }else if(h>=82.5){
         	k="B+";
         }else if(h>=77.5){
         	k="B";
         }else if(h>=71.5){
         	k="B-";
         }else if(h>=65.5){
         	k="C+";
         }else if(h>=59.5){
         	k="C";
         }else if(h>=49.5){
         	k="C-";
         }else{
         	k="F";
         }
     
     //output
     System.out.println(b+"  Grade="+h+"  Letter="+k) ;  

} 
    public static double getscore(String type,int max, int n){
	    Scanner Reader= new Scanner(System.in);
		System.out.println("Input "+type+"(maximum"+max+"):");
		double x=0;
		for(int i=1;i<=n;i++){
		System.out.print("#"+i+"==>");
		double grade=Reader.nextDouble();
		//input number in the correct range
		if(grade>max){
		System.out.println("  INPUT TOO LARGE: Type a number in the range: 0-"+max);
		i=i-1;
		grade=0;	
		}else if(grade<0){
		System.out.println("  INPUT TOO SMALL: Type a number in the range: 0-"+max);
		i=i-1;
		grade=0;
		}
		//do a sum
		x=x+grade;

}

       return x;
		

}
}