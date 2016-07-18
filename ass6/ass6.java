//Yingchao Yu
//V00830514
//CSC 110 Assignment 6


import java.util.*;

public class ass6 {

	public static void main(String[] args) {

	   double [] a={0.1,0.1,0.2,0.3,0.4,-0.5,0.6,0.7,-0.5,0.3,0.3,0.2,0.3,0.4,-0.5,0.6,0.7,-0.5,0.3,0.3};
	   double [] b={0.1,0.1,0.2,0.3,0.4,-0.5,0.6,0.7,-0.5,0.3,0.3,0.2,0.3,0.4,-0.5,0.6,0.7,-0.5,0.3,0.3};
	   System.out.println(Arrays.toString(a));
       adjustVolume(a,0,9,2);
       System.out.println(Arrays.toString(a));
       add(a,b);
       System.out.println(Arrays.toString(a));
       reverse(a);
       System.out.println(Arrays.toString(a));
       splice(a,0,6,b,3);
       System.out.println(Arrays.toString(b));
       //cant run it
       double []abc=adjustFrequency(a,0.5);
       System.out.println(Arrays.toString(a));
	//asjust the value in the array from startindex to
}		
	public static void adjustVolume(double [] samples, int startIndex, int endIndex, double factor) {
		//Adjust my method such that it will not fail
		if (endIndex>(samples.length-1)){
		
		 endIndex=samples.length;
		 }
	
		for(int i=startIndex;i<endIndex;i++){
			//if factor>1,increase the volume,if factor<1,decrease the volume
			samples[i]*=factor;
		}
		     
		
	}
	
	public static void add(double [] samples1, double [] samples2){
		int a=0;
		if(samples1.length>samples2.length){
			a=samples2.length;
		}else{
			a=samples1.length;
		}
		for(int i=0;i<a;i++){
		//add samples2 to samples1
		   samples1[i]+=samples2[i];
		   
		}
		//clipping

		}	
	
	 
    public static void reverse( double [] samples ){
    	double temp=0;
    	for(int i=0;i<(samples.length/2);i++){
    		//swap function
    		temp=samples[samples.length-1-i];
    		samples[samples.length-1-i]=samples[i];
    		samples[i]=temp;
    	}
    	
    	
    	
    	
    	
    	
    } 
    
    public static void splice( double [] source, int sourceStart, int sourceStop, double [] destination, int destStart ) {
    	//If sourceStop is beyond the last element in source
    	if(sourceStop>(source.length-1)){
    		sourceStop=source.length-1;
    	}
    	//if the destination array does not contain enough samples
    	if((destination.length-destStart)<(sourceStop-sourceStart)){
    		sourceStop=sourceStart+destination.length-destStart;
    	
    	}
    	//splice
    	for(int i=sourceStart;i<sourceStop;i++){
    		destination[destStart]=source[i];
    		destStart+=1;
    	}
    	
    	
    	
    	
    	
    }
    
    public static double[] adjustFrequency(double[] samples, double factor) {
     
    	//if factor>1,newsamples'length<samples'length,or vice versa
        double a=samples.length/factor;
        
        double s[]=new double[(int)a];
        double samplesIndex=0;
        for(int i=0;i<=(int)a;i++){
        
        s[i] = samples[(int)samplesIndex] ;
        samplesIndex =samplesIndex + factor;
        
        }

    return s;
    }
//cant run it..

		

}