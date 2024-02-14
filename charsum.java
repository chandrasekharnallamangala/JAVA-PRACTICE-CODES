package codePractice;
import java.util.Scanner;
public class charsum {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     int sum = 0;
     for(int i = 0; i< str.length();i++) {
    	 if(Character.isDigit(str.charAt(i))) {
    		 sum += Character.getNumericValue(str.charAt(i));
    	 }
     }
     System.out.println(sum);
	}

}
