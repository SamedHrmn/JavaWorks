/*  FIND PAIR WITH GIVEN SUM IN THE ARRAY
 *   For Example,
 *      Input:arr[8,7,2,5,3,1] 
 *      Sum=10
 *      
 *      Output:
 *      Pair found at index 0 and 2 (8+2)
 *      Pair found at index 1 and 4 (7+3)
 * 
 */

import java.util.Scanner;


public class Arrays_Pract {
	
	public static void Find_Pair(int sum,int []array){
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==sum) {
					System.out.println("Pair found at index "+i+" and "+j+" ("+array[i]+"+"+array[j]+" )");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int []array=new int[6];
		int sum;
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
			System.out.println("Enter array["+i+"]=");
			array[i]=input.nextInt();
		}
		
		System.out.print("Enter the sum = ");
		sum=input.nextInt();
		
		Find_Pair(sum, array);

	}

}
