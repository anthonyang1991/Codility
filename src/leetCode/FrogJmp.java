package leetCode;

public class FrogJmp {

	 public static int solution(int X, int Y, int D)
	 {
		 double curr = X;
		 double leaps = D;
		 double destination= Y;
		double disToCover = destination - curr;
		 
//		 System.out.println(Math.round(destination/leaps));
		 double ans = Math.ceil(disToCover/leaps);
		 int ansX = (int)ans;
		 
		 return ansX;
		 
		 
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solution(10, 85, 30);
		
	}

}
