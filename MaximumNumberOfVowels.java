public class MaximumNumberOfVowels {

	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static int maxVowelCount(String s, int k) {
		int count = 0;
		int n = s.length();

		for (int i = 0; i < k; i++) {
			if (isVowel(s.charAt(i))) {
				count++;
			}
		}

		int max = count;
		for (int j = k; j < n; j++) {
			if (isVowel(s.charAt(j))) {
				count++;
			}
			if (isVowel(s.charAt(j - k))) {
				count--;
			}
		}
		max = Math.max(max, count);
		return max;
	}

	public static void main(String[] args) {
		System.out.println(maxVowelCount("aeibcdaeiobcdaeiou", 3));
	}
}
