import java.util.*;
import java.io.*;

public class weather{

public static void main(String[] args)
throws FileNotFoundException{
	
Scanner input=new Scanner(new File("weather.txt"));
PrintStream output=new PrintStream(new File("chang.txt"));
double temp1=input.nextDouble();
for (int i=0;i<9;i++){
	double temp2=input.nextDouble();
	double diff=temp2-temp1;
	System.out.println(temp1+"to"+temp2+diff);
	temp1=temp2;
}
}
	
}
