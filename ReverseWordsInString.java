public class ReverseWordsInString {

	public static String reverseWords(String s) {
		String[] words = s.trim().split("\\s+");
		String out = "";
		for (int i = words.length - 1; i > 0; i--) {
			out += words[i] + " ";
		}
		return out + words[0];
	}

	public static void main(String[] args) {
		String s = "   India       is    my    country     ";
		System.out.println(reverseWords(s));
	}
}
