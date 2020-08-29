
import java.util.Map;
import java.util.HashMap;

public class Arrays_Pract {
	
	static void find_subArrayLinear(int []array) {
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0,-1);
		int len=0;
		
		int ending_index=-1;
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			sum+=(array[i]==0)? -1:1;
			
			if(map.containsKey(sum)) {
				if(len<i-map.get(sum)) {
					len=i-map.get(sum);
					ending_index=i;
				}
			}
			else {
				map.put(sum,i);
			}
		}
		
		if(ending_index!=-1) {
			System.out.println("["+(ending_index-len+1)+" , "+ending_index+"]");
		}
		else
			System.out.println("No subarray exist");
			
		
		
	}

	public static void main(String[] args) {
		int array[]= {0,0,1,0,1,0,0};
		find_subArrayLinear(array);

	}

}
