package leetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ufinity_capitalise {

	static String capitalise(String str) {

		String[] first = Arrays.stream(str.split("\\s+")).toArray(String[]::new); // spilt strings to array
		String[] second = new String[first.length]; // create string array of capfirst length
		//create return string
		String ans = "";
		for (int i = 0; i < first.length; i++) // loop through num of words in array
		{
			for (int x = 0; x < first[i].length(); x++) // change first letter to Caps rest to lower case
			{
				second[i] = first[i].substring(0, 1).toUpperCase() + first[i].substring(1).toLowerCase();

			}
			ans = ans.concat(second[i] + " "); // build back string
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(capitalise("i lOve tO solVe problems! 1 + 1 = TWO."));
	}

}

//.toArray(String[]::new);