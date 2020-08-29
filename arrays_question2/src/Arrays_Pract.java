/*GIVEN AN ARRAY OF INTEGERS,CHECK IF ARRAY CONTAINS A SUB-ARRAY HAVING 0 SUM AND PRINT ALL SUBARRAYS.
 * For Example,
 *   Input: array{3,4,-7,3,1,3,1,-4,-2,-2}
 *   Output:{3,4,-7}
 *          {4,-7,3}
 *          {-7,3,1,3
 *          {3,1,-4}
 *          {3,1,3,1,-4,-2,-2}
 *          {3,4,-7,3,1,3,1,-4,-2,-2}
 */      

public class Arrays_Pract {
	
	public static void check_Sum(int []array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=0;
			for(int j=i;j<array.length;j++) {
				sum+=array[j];
				if(sum==0) {
					System.out.print("Subarray ["+i+".."+j+"] = ");
					for(int k=i,m=j;k<=m;k++) {                        //All SubArrays have been printed.
						System.out.print(array[k]+" ");
					}
					System.out.println();
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		int []arr= {3,4,-7,3,1,3,1,-4,-2,-2};
		check_Sum(arr);

	}

}
