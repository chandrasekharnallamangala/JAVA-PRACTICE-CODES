package codePractice;

import java.util.Scanner;

public class nonrepeat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		int frequency[] = new int[256];
		for (int i = 0; i < str.length(); i++)
			frequency[str.charAt(i)]++; //For each character, we access its ASCII value using str.charAt(i) and use it as an index in the frequency array. We then increment the value at that index to count the frequency of the character.
		System.out.println("Non repeating characters are: ");
		for (int i = 0; i < 256; i++)
			if (frequency[i] == 1)
				System.out.print((char) i + " ");//For each value, we check if the corresponding frequency in the frequency array is 1. If it is, it means that character appears only once in the input string and is non-repeating. In that case, we print the character representation of the ASCII value using (char) i.
	}

}
