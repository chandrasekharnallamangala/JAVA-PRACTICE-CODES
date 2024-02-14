package codePractice;
import java.util.Scanner;
public class ascii {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int frequency[] = new int[256];
		for (int i = 0; i < str.length(); i++)
			System.out.println((char)i);
	}

}
