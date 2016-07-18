//Assignment5
//Calculating the Grades for the Entire Class!
//Name:Yingchao Yu
//ID:V00830514



import java.util.*;
import java.io.*;

public class Ass{
	  public static void main(String[] args) throws IOException {
  		
    	System.out.println("C O U R S E G R A D E C A L C U L A T O R");
    	System.out.println();
    	System.out.println("Author: L. Jackson November 2007 Update May 2011" );
    	System.out.println("Purpose: Calculated the weighted grade for a student in a course" );
    	System.out.println("         Inputs: Assignment, Problem Solving, Quiz and Exam grades ");
    	System.out.println();
    	System.out.println("INPUT being received from file. . . .");
   //input
   	File file=new File("scores.dat");
 	Scanner input=new Scanner(file);
   
 	int j=0;
 	//example for 100students.
 	double a[][]=new double[100][13];
 	double h=0;
 	int b[]=new int[100];

 	while(input.hasNextInt()){
   //for student no. and last 4 digits
      String no=input.next();
      String no1=no.substring(no.length()-4, no.length());
 	int i=1;
 	//find the grades for one student
 	while(input.hasNextDouble()&&i<13){
 
  
 		a[j][i]=input.nextDouble();
 		i=i+1;
        
 	}
 	// sum of grade
    	h=((a[j][1]+a[j][2]+a[j][3]+a[j][4]+a[j][5]+a[j][6]+a[j][7]+a[j][8])/160*24)+a[j][9]+(a[j][10]/20*3)+(a[j][11]/100*23)+(a[j][12]/100*45);
    	String k;
    	int c[]=new int[10];
     //converted to a letter grade
         if(h>=96.5){
         	k="A+";
         	c[0]=1;
         }else if(h>=92.5){
         	k="A";
         	c[1]=1;
         }else if(h>=87.5){
         	k="A-";
         	c[2]=1;
         }else if(h>=82.5){
         	k="B+";
         	c[3]=1;
         }else if(h>=77.5){
         	k="B";
         	c[4]=1;
         }else if(h>=71.5){
         	k="B-";
         	c[5]=1;
         }else if(h>=65.5){
         	k="C+";
         	c[6]=1;
         }else if(h>=59.5){
         	k="C";
         	c[7]=1;
         }else if(h>=49.5){
         	k="C-";
         	c[8]=1;
         }else{
         	k="F";
         	c[9]=1;
         }
         System.out.println();
         System.out.println(no1+"  Grade="+h+"  Letter="+k);
         System.out.println();
         System.out.println("Grade Number Receiving Grade");

 
         
         	System.out.println("A+     "+c[0]);
         	System.out.println("A      "+c[1]);
         	System.out.println("A-     "+c[2]);
         	System.out.println("B+     "+c[3]);
         	System.out.println("B      "+c[4]);
         	System.out.println("B-     "+c[5]);
         	System.out.println("C+     "+c[6]);
         	System.out.println("C      "+c[7]);
         	System.out.println("C-     "+c[8]);
         	System.out.println("F      "+c[9]);


         
    //next student:
 	j=j+1;
    }

 	
 
 	
   
 	
 	
 	
   }
}