import java.io.*;
import java.util.*;

public class ave{
	  public static void main(String[] args) throws IOException {
String word = "abcd";
char[] letters = {'d', 'c', 'b', 'a'};
  boolean c=checkIfReversable(word,letters);


	   	
    

}
 public static boolean checkIfReversable(String w,char[] l){
    boolean b=false;
    String k="";
   for(int i=0;i<l.length;i++){
   	
    k=k+l[l.length-i-1];
   }
    System.out.println(k);
    
     return b;
}
}
