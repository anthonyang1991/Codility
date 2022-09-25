package leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
// smallest positive number in the array
	public static int solution(int[] A) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
	    
//	    while (it.hasNext())
//	    {
//	    	System.out.println("The set value is:"+it.next());
//	    }
		
	    int[] Arrayx = new int[set.size()];
	    Arrayx = set.stream().mapToInt(Integer::intValue).toArray();
	    int[] noNegetiveArray = Arrays.stream(Arrayx).filter(x-> x >0).toArray();
	  
	    
	    int ans =0 ;

	   for(int x=0; x < noNegetiveArray.length -1;x++)
	   {	
		   if(noNegetiveArray[x+1]-noNegetiveArray[x]==2) 
			   ans = noNegetiveArray[x+1]-1;
		   
		 
		    
		   
	   }
	
	   if(ans == 0)
		   ans=noNegetiveArray.length+1;

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-1,0, 2, 3};
		int[] b = {1, 3, 6,4,1,2};

		System.out.println(solution(A));

	}

}
