package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class permMissingElem {

	public static int solution(int[] A)
	{
		HashSet<Integer> setx = new HashSet<>();
		
		for(int i=1;i<=A.length+1;i++)
		{
			setx.add(i);
		}
		
		for(int x=0;x<A.length;x++)
		{
		 setx.remove(A[x]);
		}
		
		return setx.iterator().next();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {2,3,1,5};
		System.out.println(solution(b));
	}

}
