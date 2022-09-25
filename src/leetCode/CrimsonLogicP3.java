package leetCode;

public class CrimsonLogicP3 {

	public static int solution(int N) {

		String ans = "";
		int ansInInteger = 0;

		if (N % 9 != 0) {
			ansInInteger = N % 9;
			ans += String.valueOf(ansInInteger);
		}

		int numOfLoops = N / 9;

		for (int i = 1; i <= numOfLoops; i++) {
			ans += "9";

		}

		return Integer.parseInt(ans);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(16));
	}

}
