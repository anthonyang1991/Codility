package leetCode;

import java.util.Arrays;

public class TapeEquilibrium {

	public static int solution(int[] A)
	{
		
		
		int secondPart = 0;
		for(int i=0; i<A.length;i++)
		{
			secondPart += A[i];
		}
		
		int[] smallest = new int[A.length-1];
		
		int diff =0;
		int firstPart = 0;
		for(int x=0;x<A.length-1;x++)
		{
			secondPart-=A[x];
			firstPart+=A[x];
			
			diff = Math.abs(firstPart - secondPart);
			
			smallest[x]= diff;		
		}
		int ans = Arrays.stream(smallest).min().getAsInt();
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b = {3,1,2,4,3};
		System.out.println(solution(b));
	}

}
