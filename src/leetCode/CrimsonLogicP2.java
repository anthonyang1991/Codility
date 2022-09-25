package leetCode;

public class CrimsonLogicP2 {

	
	   public static int solution(String S)
	   {
		   int binary = Integer.parseInt(S,2);

		  int count = 0;
		  
		  
		  while(binary != 0)
		  {
			  while(binary%2==0)
			  {
				  
				  if(binary==0)
					  break;
				  
				  binary = binary/2;
				  count++;
				  
				  while(binary%2==1)
				  {
					  binary =  binary -1 ;
					  count++;
					  
					  if(binary == 0)
						  break;
				  }
			  }
		  }
		   
		  return count;
		   
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution("011100"));
		
	}

}
