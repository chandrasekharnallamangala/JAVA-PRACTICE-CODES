package codePractice;
import java.util.Scanner;
public class toggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc.nextLine();
		String str = "";
		for(int i = 0; i<s1.length(); i++)
		{
			if(Character.isUpperCase(s1.charAt(i)))
				str=str+Character.toLowerCase(s1.charAt(i));
			else
				str=str+Character.toUpperCase(s1.charAt(i));
		}
		System.out.println(str);
	}

}
