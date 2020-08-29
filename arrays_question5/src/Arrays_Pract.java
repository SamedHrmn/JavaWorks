/*FIND LARGEST SUB ARRAY FORMED BU CONSECUTIVE INTEGERS
 * For Example:
 *   Input:{2,0,2,1,4,3,1,0}
 *   Output:{0,2,1,4,3}
 * 
 */


import java.lang.Math;

public class Arrays_Pract {
	
	static boolean isConsecutive(int array[],int i,int j,int max,int min) {
		if(max-min!=j-i)  //Eðer dizi ardýþýk sayýlarla oluþmuþsa SubArray boyutu.
			return false;
		
		boolean visited[]=new boolean[j-i+1];
		
		for(int k=i;k<=j;k++) {
			if(visited[array[k]-min])
				return false;
			
			visited[array[k]-min]=true;
		}
		return true;
		
		
	}
	
	static void find_MaxSubArray(int array[]) {
		int len=1;
		int start = 0,end=0;
		
		for(int i=0;i<array.length-1;i++) {
			int min_Val=array[i],max_Val=array[i];
	         for(int j=i+1;j<array.length;j++) {
	        	 
	        	 max_Val=Math.max(max_Val,array[j]);
	        	 min_Val=Math.min(min_Val,array[j]);
	        	 
	        	 if(isConsecutive(array, i, j, max_Val, min_Val)) {
	        		 if(len<max_Val-min_Val+1) {
	        			 start=i;
		        		 end=j;
		        		 len=max_Val-min_Val+1;
	        		 }
	        	 }
	         }
		}
		
		System.out.println("The largest subArray = ["+start+", "+end+"]");
	}

	public static void main(String[] args) {
		int array[]= {2,0,2,1,4,3,1,0};
		find_MaxSubArray(array);

	}

}
