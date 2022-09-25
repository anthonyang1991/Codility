package leetCode;

public class CyclicRotation {

	 public static int[] solutionx(int[] A, int K)
	 {
		 int[] returnArray = new int[A.length];
		   
		    for(int i=0; i<A.length; i++) {
		      
		      int newIndex = (i + K) % A.length;

		      returnArray[newIndex] = A[i];
		    }
		    return returnArray;
		 
		
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1, 3, 6,4,1,2};
		solutionx(b,20);
	}

}
