package leetCode;

public class BinaryGapMain {

	public static int solution(int N) {
		// write your code in Java SE 11
		String binaryString = Integer.toString(N, 2);
		boolean start = false;
		
		int curr_count =0;
		int max_count=0;
		
		for(int i=0;i<binaryString.length();i++)
		{
//			String c = binaryString.substring(i,i+1);
//			System.out.println(c);
			
			if(binaryString.charAt(i)== '1')
			{
				if(start)
				{
					if(curr_count>max_count)
					{
						max_count =curr_count;
					}
				}
				curr_count =0;
				start=true;
					
			}
			
			if(binaryString.charAt(i)== '0')
				curr_count++;
		}
		return max_count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(9));

	}

}
