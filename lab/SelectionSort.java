/*
 * SelectSort program complete with stubs.  Implement and test in the order given.
 */

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] numsArray = {7, 2, 4, 1, 0, 9, 6, 8, 3, 5};
		
		System.out.print("The original array:\t");
		printArray(numsArray);
		int k=findMinPosition(numsArray,4);
		System.out.println(k+"  "+numsArray[k]);
		swap(numsArray,1,2);
		printArray(numsArray);
		
		sortArray(numsArray);
		printArray(numsArray);
		//Method tests: Call and use printlns to view the results of your completed methods.
		
		//1) Complete findMinPosition method so it returns the position of the smallest value in the array
		
		//2) Add a second parameter to findMinPosition, so it looks like 
		//		public static int findMinPosition(int[] arr, int startPosition)
		//	 so it searches for the minimum position FROM a given startPosition
		// and complete this method.			 
		
		//3) Complete and test the swap method
		
		//4) Complete and test the sortArray method
		
		/*
		System.out.print("The sorted array:\t");		
		printArray(numsArray);
		*/
	
	}
	
	public static void printArray(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if (i<arr.length-1) {
				System.out.print(", ");
			} else {
				System.out.println(".");
			}
		}
	}
	
	/*
	 * Finds the minimum value in Array arr, (part 2: starting the search at startPosition)
	 * returns the position of the minimum value
	 */
	public static int findMinPosition(int[] arr,int sp) {
        int p=sp;
        int m=arr[sp];
		for(int i=(sp);i<arr.length;i++){

			if (m>arr[i]){
				m=arr[i];
		        p=i;
			}
		     
		}	

		
		return p;
	
	}
	
	/*
	 * Swaps the elements between pos1 and pos2 in Array arr.
	 */
	public static void swap(int[] arr, int pos1, int pos2) {
		int s=0;
		s=arr[pos1];
		arr[pos1]=arr[pos2];
		arr[pos2]=s;
	}
	
	/*
	 * Sorts Array arr using the selection-sort algorithm, which has the following steps (from wikipedia):
	 * 1 - Find the minimum value in the array
	 * 2 - Swap that value with the value at the start of the array
	 * 3 - Repeat prior steps for the remainder of the array (starting at the 2nd position, and advancing each time)
	 */
	public static void sortArray(int[] arr) {
		//Look at the steps in the comments above.
		//Can we use our findMinPosition and swap methods within this method?
		
		int position=0;  
         for(int i=0;i<arr.length;i++){       
         int j=i+1;  
         position=i;  
          int temp=arr[i];  
          for(j=i+1;j<arr.length;j++){  
             if(arr[j]<temp){  
                 temp=arr[j];  
                 position=j;  
              }  
           } 
           arr[position]=arr[i];  
           arr[i]=temp;  
       }  
           }
           }
           
		
		
		
	
	
