package leetCode;

import java.util.Arrays;

public class highestRecurCharInString {

	
	public static char solution(String input)
	{
		int[] hash = new int[26];
		char[] alphe = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		
		for(int i=0; i<input.length();i++)
		{
			char curr = input.charAt(i);
			hash[curr-'a']++;
		}
		int largestNumber =0;
		int largestNumberIndex =0;
		for(int x=0; x<hash.length;x++)
		{
			 if(hash[x]>largestNumber)
			 {
				 largestNumber = hash[x];
				 largestNumberIndex = x;
			 }
			 
		}
		System.out.println(alphe[largestNumberIndex]);
		
		return alphe[largestNumberIndex];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "samplestring";
		solution(input);
		

	}

}
