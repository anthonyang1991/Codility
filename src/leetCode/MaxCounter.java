package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class MaxCounter {

	 public static int[] solution(int N, int[] A)
	 {
		
		 int[] counter = new int[N]; // 0 0 0 0 0
		 Arrays.fill(counter,0);
		 
		 int curr_max =0;
		
		 
		 for(int i=0;i<A.length;i++) //3,4,4,6,1,4,4
		 {
			int pos = A[i] - 1;
			
			if(pos>=N)
			{
				pos = 0;
				Arrays.fill(counter, curr_max);
			}
			
			else {
				counter[pos]++;
				
				if(curr_max <= counter[pos])
				curr_max = counter[pos];
			}
			 
			 //check if A[i] = N+1 if true set all to max
		 }
		 
		 
		 return counter;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N =5;
		int[] A = {3,4,4,6,1,4,4};
		
		Arrays.stream(solution(5,A)).forEach(System.out::println);

	}

}
