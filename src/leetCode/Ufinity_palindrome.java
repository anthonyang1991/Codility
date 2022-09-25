package leetCode;

public class Ufinity_palindrome {

	static boolean isPalindrome(String str) {

		if (str == null)
			return false;

		if (str.length() <= 1)
			return true;

		String firstChar = str.substring(0, 1);
		String lastChar = str.substring(str.length() - 1, str.length());

		if (!firstChar.equals(lastChar))
			return false;

		else
			return isPalindrome(str.substring(1, str.length() - 1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome(null));

	}

}
