/*In-Place Merge Two Sorted Arrays
 * Given two sorted arrays X[] and Y[] of size m and n each,merge elements of X with elements of array Y by maintaining the sorted order.
 * -->The conversion should be done in place and without using any other data structure.
 * 
 * For example:
 *   Input:  X[]={1,4,7,8,10}
 *           Y[]={2,3,9}
 *   
 *   Output: X[]={1,2,3,4,7}
 *           Y[]={8,9,10}
 */


import java.util.Arrays;

public class Arrays_Pract {
	
	static void sortArray(int []a,int []b) {
		
		
		int m=a.length;
		int n=b.length;
		
		for(int i=0;i<m;i++) {
			if(a[i]>b[0]) {
				int temp=a[i];
				a[i]=b[0];
				b[0]=temp;
				
				int first=b[0];
				int k;
				for( k=1;k<n && b[k]<first;k++) {
					b[k-1]=b[k];
				}
				
				b[k-1]=first;
			}
			
			
		}
		
		
		System.out.print(Arrays.toString(a));
		System.out.println();
		System.out.print(Arrays.toString(b));
	}

	public static void main(String[] args) {
		int []a= {1,4,7,8,10};
		int []b= {2,3,9};
		sortArray(a,b);
 
	}

}
