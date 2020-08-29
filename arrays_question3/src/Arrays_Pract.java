/*SORT BINARY ARRAY IN LINEAR TIME
 * Given an binary array,sort it in linear time and constant space.Output should print contain all zeroes followed by all ones.
 * 
 * 
 */


import java.util.Arrays;

public class Arrays_Pract {
	

	public static void sort_Linear(int[] array) {
		int zeros=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==0)
				zeros++;
		}
		
		int index=0;
		while(zeros-- !=0) {
			array[index++]=0;
		}
		
		while(index<array.length)
			array[index++]=1;
		
	}
	
	public static void main(String[] args) {
		
		int array[]= {0,0,1,0,1,1,0,1,0,0};
		sort_Linear(array);
		System.out.println(Arrays.toString(array));
		

	}

}
