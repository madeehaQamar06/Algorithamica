package Strings;

import java.util.Scanner;

public class ValidString {
	static boolean isInteger(String str) {
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (isDigit(str.charAt(i)) && (isUpper(str.charAt(i)) || isLower(str.charAt(i)))
					&& (str.charAt(0) == '+' || str.charAt(0) == '-')) {
				flag = false;
			} else if (isLower(str.charAt(i))) {
				flag = false;
			} else if (isUpper(str.charAt(i))) {
				flag = false;
			} else if (isDigit(str.charAt(i)) || str.charAt(0) == '+' || str.charAt(0) == '-') {
				flag = true;
			}
		}
		return flag;
	}

	static boolean isLower(char ch) {
		return ch >= 'a' && ch <= 'z';
	}

	static boolean isUpper(char ch) {
		return ch >= 'A' && ch <= 'Z';
	}

	static boolean isDigit(int c) {
		return c >= '0';
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str = s.next();
		System.out.println(isInteger(str));

	}

}
