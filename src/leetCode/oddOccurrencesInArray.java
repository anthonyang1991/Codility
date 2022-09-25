package leetCode;

import java.util.HashSet;

public class oddOccurrencesInArray {

	public static int solution(int[] A)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<A.length;i++)
		{
			if(set.contains(A[i]))
				set.remove(A[i]);
			
			else
			{
				set.add(A[i]);
			}
		}
		return set.iterator().next();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b = {1,3,2,3,4,6,4,1,2};
		System.out.println(solution(b));
	}

}
