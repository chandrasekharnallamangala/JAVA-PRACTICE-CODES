package codePractice;
import java.util.Scanner;
public class removevowels {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string: ");
		 String str = sc.nextLine();
		 String s1 = "";
		 s1 = str.replaceAll("[aeiouAEIOU]", ""); 
		 System.out.println(s1); 
		
		

	}

}
