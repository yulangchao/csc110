public class ab {

	public static void main( String [] args){
		
				int[][] a = new int[8][6];
				a[0][0]=3;
				a[0][3]=4;
				a[2][5]=5;
				a[5][3]=2;
				a[7][0]=1;
				a[7][5]=6;	
		System.out.println(a.length);
		System.out.println(a[4].length);	
		System.out.println(a[5][3]);
			System.out.println();	
for (int i = 0; i < a.length; i++) {
     for (int j = 0; j < a[i].length; j++) {
          if (i == j) {
               a[i][j] = a[i][j]+2;
          }
          System.out.print(a[i][j]+" ");

     }
     System.out.println();
}

     			System.out.println();
	}
	}