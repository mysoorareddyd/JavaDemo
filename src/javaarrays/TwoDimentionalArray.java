package javaarrays;
/*
 * 2.Two dimensional array Dimensional array
 *   --------------------
 *   1)Declare an array
 *   2)insert values into array
 *   3)find size of an array
 *   4)Read values from an array.
 *   
 *   int a[][]=new int[3][2];// 3 rows ;2columns
 */

public class TwoDimentionalArray {

	public static void main(String[] args) {
		/*int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		
		int a[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println("Number of rows:"+a.length);
		System.out.println("number of columns:"+a[0].length);
		
		for (int i=0;i<a.length;i++) { //out loop
			for(int j=0;j<a[i].length;j++) { //inner loop
				System.out.println(a[i][j]);
			}
		}
		//For each loop
		for(int r[]:a) {
			for(int i:r) {
				System.out.println(i);
				
			}
		}
	}

}
