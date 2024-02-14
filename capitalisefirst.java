package codePractice;

import java.util.Scanner;

public class capitalisefirst {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			capital(str);// function using stringbuilder class
			capital2(str);// function using characters
		}
	}

	public static void capital(String str) {
		StringBuilder sb = new StringBuilder(str);
		char s1 = Character.toUpperCase(sb.charAt(0));
		char s2 = Character.toUpperCase(sb.charAt(sb.length() - 1));

		sb.setCharAt(0, s1);
		sb.setCharAt(sb.length() - 1, s2);
		System.out.println(sb.toString());
	}

	public static void capital2(String str) {
		char s1 = Character.toUpperCase(str.charAt(0));
		char s2 = Character.toUpperCase(str.charAt(str.length() - 1));
		String mid = str.substring(1, str.length() - 1);
		System.out.println(s1 + mid + s2);
	}
}
