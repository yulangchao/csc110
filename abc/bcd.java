 public class bcd{

 public static void main(String[] args) {

int c=gcd(15,9);
System.out.println(c);
}
public static int gcd(int b,int c){

int a=1;
while(b%c!=0){
  
  a=b%c;
  b=c;	
  c=a;
}
return c;
}
}
