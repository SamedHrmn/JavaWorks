/*FIND DUPLICATE ELEMENT IN A LIMITED RANGE ARRAY
 * For Example:
 *   Input: array{1,2,3,4,4}
 *   Output:Duplicate element is 4
 * 
 */


public class Arrays_Pract {
	
	public static int find_Duplicate(int []array) {
		boolean visited[]=new boolean[array.length+1];
		
		for(int i=0;i<array.length;i++) {
			if(visited[array[i]])
				return array[i];
			
			visited[array[i]]=true;
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int []array= {1,2,3,4,4};
		System.out.println("Duplicate element is "+find_Duplicate(array));

	}

}
