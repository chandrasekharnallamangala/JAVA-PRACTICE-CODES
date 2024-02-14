package codePractice;

import java.util.Scanner;

public class removebracks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch == '(') || (ch == ')')) {
				sb.append(' ');

			} else {
				sb.append(ch);
			}
		}
		System.out.println(sb);

	}

}
