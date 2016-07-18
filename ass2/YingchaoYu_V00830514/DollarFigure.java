//From textbook: Page 131, Question #22 
//Embed the code in this question into the main method of a class called Numbers.java

public class DollarFigure{

	public static void main(String args[]){
	
		for(int i=1; i<=7; i++){ 
		   for(int j=2;j<2*i;j++){
		   	
		   System.out.print("*");
		   }
		   for(int k=7;k>=i;k--){
	
		   System.out.print("$");
		   }
		   for(int l=14;l>2*(i-1);l--){
	
		   System.out.print("*");
		   }
		   for(int k=7;k>=i;k--){
	
		   System.out.print("$");
		   }
		   for(int j=2;j<2*i;j++){
		   	
		   System.out.print("*");
		   }
		   System.out.println();
		}
		
	}
}	