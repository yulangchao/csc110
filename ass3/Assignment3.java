//V00830514  Yingchao Yu
public class Assignment3{
    public static void main(String[] args){
	printNumbers(10);
	printPowersof2(9);
    printPowersofN(-3,7);
	
	
	}
	public static void printNumbers(int x){
	
		 for(int i=1;i<=x;i++){
		    System.out.print("["+i+"]"+" ");
			
		}
			System.out.println();
			System.out.println();
	}
	public static void printPowersof2(int x){

	     for(int i=0;i<=x;i++){
		    double k=Math.pow(2, i);
		    System.out.print((int)k+" ");
		
		}
			System.out.println();
			System.out.println();
	}
	public static void printPowersofN(int x,int y){

	     for(int i=0;i<=y;i++){
		    double j=Math.pow(x, i); 
		    System.out.print((int)j+" ");
			
		}
			System.out.println();
			System.out.println();
	}
}	