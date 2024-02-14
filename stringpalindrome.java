package codePractice;

import java.util.Scanner;

public class stringpalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();
		String str2 = str1.toString();
		if (str.equals(str2)) {
			System.out.println("given string is a palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

}
