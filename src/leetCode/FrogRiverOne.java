package leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;


public class FrogRiverOne {
	
	public static int solution(int X, int[] A)
	{	
		int ans = 0;
		
		Integer[] arr = IntStream.range(1,X+1).map(x ->x).boxed().toArray(Integer[]::new);
		
		 Set<Integer> set = new HashSet<>();
		
		Collections.addAll(set,arr);
		
		for(int i=0;i<A.length;i++)
		{
			if(set.contains(A[i]))
				set.remove(A[i]);
			
			if(set.isEmpty())
			{
				ans = i;
				break;
			}
		}
		
		if(!set.isEmpty())
			return -1;
		
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b = {2,2,2};
	System.out.println(solution(2,b));

	}

}
