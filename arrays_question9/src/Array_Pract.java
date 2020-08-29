import java.util.Arrays;

/*Merge two arrays by satisfying given constraints.
 *  Given two sorted arrays X[] and Y[] of size m and n each where m>=n and X has exactly n vacant cells.
 *  merge elements of Y in their correct position in array X
 *  
 *   For example:
 *    Input: X[]={0,2,0,3,0,5,6,0,0}
 *           Y[]={1,8,9,10,15}
 *           
 *    Output: X[]={1,2,3,5,6,8,9,10,15}
 * 
 */


public class Array_Pract {
	
	static void merge(int X[],int Y[],int m,int n) {
		int k=m+n+1;
		
		while (k >= 0)
		{
		    // put next greater element in next free position in X[] from end
		    if (m >= 0 && X[m] > Y[n]) {
		        X[k--] = X[m--];
		    } else {
		        X[k--] = Y[n--];
		    }
		}
		
		while(n>=0) {
			X[k--]=Y[n--];
		}
		
		Arrays.fill(Y, 0);
	}
	
	
	static void rearrange(int X[],int Y[]) {
		int k=0;
		for(int i=0;i<X.length;i++) {
			if(X[i]!=0) {
				X[k++]=X[i];
			}
		}
		
		merge(X,Y,k-1,Y.length-1);
	}

	public static void main(String[] args) {
		int X[]={0,2,0,3,0,5,6,0,0};
		int Y[]={1,8,9,10,15};
		
		rearrange(X, Y);
		System.out.println(Arrays.toString(X));

	}

}
