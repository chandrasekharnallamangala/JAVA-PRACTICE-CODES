package codePractice;

import java.util.Scanner;
import java.util.Arrays;

public class sameArrays {

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of first array");
		int s1 = sc.nextInt();
		System.out.println("enter size of second array");
		int s2 = sc.nextInt();
		int[] arr1 = new int[s1];
		int[] arr2 = new int[s2];
		if (s1 != s2) {
			System.out.println("two arrays are not same");
		} else {
			for (int i = 0; i < s1; i++) {
				arr1[i] = sc.nextInt();
			}
			for (int j = 0; j < s2; j++) {
				arr2[j] = sc.nextInt();
			}

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for (int i = 0; i < s1; i++) {
				if (arr1[i] == arr2[i])
					continue;
				else {
					flag = 1;
					break;

				}
			}
		}
		if (flag == 1) {
			System.out.println("arrays are not equal");
		} else
			System.out.println(" equal");
	}
}
