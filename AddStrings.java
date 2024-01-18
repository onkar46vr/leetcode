public class AddStrings {

	public static String addition(String num1, String num2) {
		boolean carry = false;
		String result = "";
		int maxL = Math.max(num1.length(), num2.length());
		for (int i = 0; i < maxL; i++) {
			int k = 0;
			if (num1.length() - 1 - i >= 0) {
				k += Integer.parseInt(String.valueOf(num1.charAt(num1.length() - 1 - i)));
			}
			if (num2.length() - 1 - i >= 0) {
				k += Integer.parseInt(String.valueOf(num2.charAt(num2.length() - 1 - i)));
			}
			if (carry) {
				k++;
				carry = false;
			}
			if (k >= 10) {
				carry = true;
			}
			result = String.valueOf(k % 10) + result;
		}
		if (carry) {
			result = "1" + result;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(addition("99999", "11"));
	}
}
