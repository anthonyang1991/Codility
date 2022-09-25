package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Ufinity_points {

	
	 static int points(String[] player, String[] dictionary) {
		
		int ans = 0;
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	
	String[] noDupDictionary = Arrays.stream(player).distinct().toArray(String[]::new);
	
	for(int i=0; i< dictionary.length;i++)
	{
		map.put(dictionary[i],(dictionary[i].length()*dictionary[i].length()));
	}
	
	for(int x =0; x<noDupDictionary.length;x++)
	{
		if(map.containsKey(noDupDictionary[x]))
				ans += map.get(noDupDictionary[x]);
				
	}
	
	
	return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String [] player = { "apple", "orange", "strawberry" };
//		String[] dictionary = { "strawberry", "orange", "grapefruit", "watermelon" };
//		int point = points(player,dictionary);
//		System.out.println(point);
//		
//		String [] player2 = { "orange","orange" };
//		String[] dictionary2 = { "strawberry", "orange", "grapefruit", "watermelon" };
//		int point2 = points(player2,dictionary2);
//		System.out.println(point2);
		
		int i = 5;
		int j = 7;
		int k = i + ++j;
		System.out.print(k + "," + j);


	
	}
}
