package com.mer.strings.String_Palindrome;

public class StringPalindrome {

	public static void main(String arg[]) {
		checkPalindrome("parap");
		checkPalindrome("param");
	}

	public static void checkPalindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}
	}
}

//Output
//parap is palindrome
//param is not palindrome