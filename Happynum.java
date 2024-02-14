package codePractice;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class Happynum {
	public static int caldigsquarsum(int n) {
		int sumofsquare = 0;
		while(n > 0) {
			int digit = n % 10;
			sumofsquare += digit * digit;
			n /= 10;
		}
		return sumofsquare;
	}
	public static boolean ishappy(int n) {
		Set<Integer> seen = new HashSet<>();
		while (n != 1 && !seen.contains(n)) {  //loop repeats until 1 is not encountered and the generated sum of square value is not present in the list
			seen.add(n);
			n = caldigsquarsum(n);
		}
		return n == 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
System.out.println(ishappy(n));
//System.out.println(ishappy(19));
	}

}
