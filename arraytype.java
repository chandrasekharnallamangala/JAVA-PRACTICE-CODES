package codePractice;
import java.util.Scanner;
public class arraytype {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int od = 0;
		int ev = 0;
		System.out.printf("enter %d eements into array",n);
	for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	for(int j = 0 ; j < n ; j++) {
		if(arr[j] % 2 == 0) {
			ev++;
		}
		else {
			od++;
		}
	}
	if(ev == n) {
		System.out.println("Even Array");
	}
	else if(od == n){
		System.out.println("Odd Array");
	}
	else {
		System.out.println("Mixed Array");
	}
	}

}
