public class MaxVowelCount {

	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static int maxVowels(String s, int k) {
		int max = 0;
		int left = 0;
		int currCnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				currCnt = currCnt + 1;
			}
			if (i - left == k - 1) {
				if (currCnt > max) {
					max = currCnt;
				}
				if (isVowel(s.charAt(left))) {
					currCnt = currCnt - 1;
				}
				left = left + 1;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(maxVowels("abciiidef", 2));
	}
}
