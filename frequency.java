package codePractice;

import java.util.Scanner;

public class frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] frequency = new int[str.length()];
		char arraychar[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			frequency[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (arraychar[i] == arraychar[j]) {
					frequency[i]++;
					arraychar[j] = '0';
				}
			}
		}
		for(int k=0;k<str.length();k++) {
		if(arraychar[k] != ' ' && arraychar[k] != '0') 
			 System.out.println(arraychar[k] + " - " + frequency[k]);
		}
	}

}
