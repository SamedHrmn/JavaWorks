/*FIND MAXIMUM LENGTH SUB ARRAY HAVING GIVEN SUM
 * For Example:
 *   Input={5,6-5,5,3,5,3,-2,0} , Sum=8
 *   Output={-5,5,3,5}
 */


public class Arrays_Pract {

	static void find_SubArray(int []array,int sum) {
		
		int mySum=0,endIndex=0,len=0;
		for(int i=0;i<array.length-1;i++) {
			mySum=0;
			for(int j=i+1;j<array.length;j++) {
				mySum+=array[j-1];
				if(mySum==sum && len<j-i-1) {
					len=j-i-1;
					endIndex=j-1;
				}
			}
		}
		
		
		System.out.print("Max Length SubArray ["+(endIndex-len)+".."+endIndex+"]= ");
		for(int i=endIndex-len;i<=endIndex;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int []array= {5,6,-5,5,3,5,3,-2,0};
		find_SubArray(array, 8);

	}

}
