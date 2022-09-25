package leetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermCheck {

	public static int solution(int[] A)
	{
		Set<Integer> set = new HashSet<Integer>();
		
		set = IntStream.range(1, A.length+1).boxed().collect(Collectors.toSet());
		
		for(int i=0;i<A.length;i++)
		{
			if(set.contains(A[i]))
				set.remove(A[i]);
			
			if(set.isEmpty())
				return 1;
		}
		
		if(!set.isEmpty())
			return 0;
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b = {2,3,1,4};
		System.out.println(solution(b));

	}

}
