
 
 public class cos{

 public static void main(String[] args) {
 double a=1;
 int n=2;
 double b=0.5877852525;	
 double x=3.1415926*0.3;
while(Math.abs(1-a/b)>5*Math.pow(10,-8)){
	int c=1;
	for(int i=1;i<(n+1);i++){
		c=c*i;
	}
	a=a+Math.pow(-1,n/2)*Math.pow(x,n)/c;
	n=n+2;
	System.out.println(n/2+"th is "+a);
}
}

}