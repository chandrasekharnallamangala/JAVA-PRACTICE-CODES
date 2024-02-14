package codePractice;
// for getting maximum scalar product ,sort arrays into ascending order and multiply the corresponding elements 
import java.util.Scanner;
public class maxscalar {

	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("enter size of array1:");
			int n1 = sc.nextInt();
			System.out.println("enter size of array2:");
			int n2 = sc.nextInt();
			System.out.println("enter elements into array1");
			int[] arr1 = new int[n1];
			int[] arr2 = new int[n2];
			for(int i = 0; i < n1 ; i++ ) {
				arr1[i] = sc.nextInt();	
			}
			System.out.println("enter elements into array2");
			
			for(int i = 0; i < n2 ; i++ ) {
				arr2[i] = sc.nextInt();	
			}
			
			if(n1 != n2) {
				System.out.println("scalar product is not possible");
			}
			else {
				int sum = calscalpro(arr1,arr2);
				System.out.println("maximum scalar product is:" +sum);
			}
	}
public static int calscalpro(int[] arr1,int[] arr2) {
	int sum = 0;
	for(int i = 0; i < arr1.length-1; i++ ) {
		for(int k = 0;k < arr1.length - i - 1;k++) {
		if(arr1[k] > arr1[k+1]) {
			int temp = arr1[k];
			arr1[k] = arr1[k+1];
			arr1[k+1] = temp;
		}
	}
	}
	for(int j = 0; j < arr2.length-1; j++ ) {
		for(int p = 0 ;p < arr2.length-j-1;p++) {
			
		
		if(arr2[p] > arr2[p+1]) {
			int temp = arr2[p];
			arr2[p] = arr2[p+1];
			arr2[p+1] = temp;
		}
		}
	}
//	for(int l = 0;l<arr1.length;l++) {
//		System.out.println(arr1[l]);
//	}
	for(int k = 0; k < arr1.length; k++) {
		sum += arr1[k] * arr2[k];
	}
	return sum;
}

}
