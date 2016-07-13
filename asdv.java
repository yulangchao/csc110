 import java.util.*;
 
 public class asdv{

 public static void main(String[] args) {
 double a=1;
 int n=2;
 double b=0.5877852525	
 double x=3.14*0.3
while(Math.abs(1-a/b)>5*Math.pow(10,8)){
	a=a+Math.pow(-1,n/2)*Math.pow(x,n)/jiecheng(n);
	n=n+2;
	System.out.println(n/2+"name is "+a);
}
}
public int jiecheng(n){
	if(n=1){
		return 1;
	}else{
	
	return n*jiecheng(n-1);
	}
}
}