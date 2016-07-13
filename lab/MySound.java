/**
 * File: MySound.java
 *
 * Description:
 *		Program Shell for the Sound Assignment
 *
 * Requires media.jar and two_second.au
 * in the same directory as this file
 *
 * Compiles with the following command:
 * javac -classpath media.jar;. MySound.java
 *
 * Runs with:
 * java -classpath media.jar;. MySound
 *
 * For Mac computers replace the semicolon (;) with a colon (:)
 **/
public class MySound
{
	public static void main( String [] args )
	{
		// Get sound in from specified .au file.
		Sound sound1 = new Sound( "two_second.au" );

		// Play it
		System.out.println("About to play sound ...");
		sound1.blockingPlay();
		System.out.println("Finished playing sound");
		
		/*
		//	Create array of doubles from sound.
		double [] samples = getSampleValues(sound1);
		printArray(samples);
		
		//Here you can change the sound via an array of doubles
		double [] reversed = reverse(samples);
		
		// Convert it back to a sound file
		setSampleValues( sound1, reversed );
		
		//Play reversed		
		System.out.println("About to play reversed sound ...");
		sound1.blockingPlay();
		System.out.println("Finished playing sound");
		*/
		
		System.out.println("Program exit.");
	}
	
	// Name: printArray
	// Purpose: Prints an array of doubles
	// Input: An array of doubles 
	// Output: The contents of the array
	public static void printArray(double[] arr) {
		System.out.print("{");
		for (int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i] + ",");
		}	
		System.out.println(arr[arr.length-1] + "}");
	}

	// Name: reverse
	// Purpose: Creates a new array that is the reverse of the input array
	// Input: An array of doubles
	// Output: A new reversed array
	public static double[] reverse(double[] arr) {
		double[] temp = new double[arr.length];
		
		for (int i=0; i<arr.length; i++) {
			temp[i] = arr[arr.length-i-1];	
		}
		
		return temp;
	}

	// Name: getSampleValues 
	// Purpose: Converts a sound to an array of double values 
	// Input: A Sound object  
	// Output: returns the samples in an array of doubles 
	public static double [] getSampleValues(Sound s) 
	{ 
	 	int nSamples = s.getNumSamples(); 
	 	double [] samples = new double [nSamples]; 
	 	double nextSample; 
		for( int i=0 ; i<nSamples ; i++ ) { 
			nextSample = s.getSampleValueAt(i); 
		 	if( nextSample < 0 ) {
		 		samples[i] = nextSample / 32768; 
		 	} else {
		 		samples[i] = nextSample / 32767; 
	 		}
		} 
	 	return samples; 
	} 
	
	// Name: setSampleValues 
	// Purpose: Creates a Sound object from an array of doubles. 
	// Input: any Sound object (will be manipulated) 
	// an array of double [] values 
	// Output: The Sound object is returned once manipulated to 
	// contain the values of the array. 
	public static Sound setSampleValues(Sound sound, double[] samples) { 
		if( sound.getNumSamples() != samples.length ) {
			sound = new Sound( samples.length ); 
		} 
		double temp; 
	 	for( int i=0 ; i<samples.length ; i++ ){ 
			if( samples[i] > 0 ) {
				temp = samples[i] * 32767; 
			} else {
				temp = samples[i] * 32768; 
			}
			sound.setSampleValueAt( i , (int)temp ); 
		} 
		return sound; 
	} 
	
}
