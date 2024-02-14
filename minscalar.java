package codePractice;

import java.util.Scanner;

public class minscalar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int j = 0; j < m; j++) {
			arr2[j] = sc.nextInt();
		}
		ascend(m, arr1);
		descend(m, arr2);
		mindot(m, arr1, arr2);
	}

	static void ascend(int m, int arr1[]) {
		int temp = 0;

		for (int i = 0; i < m - 1; i++) {
			for (int j = 0; j < m - i - 1; j++) {

				if (arr1[j] > arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
////		for (int k = 0; k < m; k++) {
////			System.out.println(arr1[k]);
//		}
	}

	static void descend(int n, int arr2[]) {
		int temp = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {

				if (arr2[j] < arr2[j + 1]) {
					temp = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = temp;
				}
			}
		}
//		for (int k = 0; k < n; k++) {
//			System.out.println(arr2[k]);
//		}
	}

	static void mindot(int m, int[] arr1, int[] arr2) {
		int result = 0;
		for (int i = 0; i < m; i++) {
			result += arr1[i] * arr2[i];
		}
		System.out.println(result);
	}
}
