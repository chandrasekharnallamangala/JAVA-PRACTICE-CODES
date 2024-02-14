package codePractice;
import java.util.Scanner;
public class replace1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number" );
		int num = sc.nextInt();
		int newnum =0;
		if (num == 0) 
			newnum = 1;
		
			
		
		
		while(num > 0) {
			int rem = num % 10;
			if(rem == 0) 
				rem = 1;
			
			num = num/10;
			newnum = newnum * 10 + rem;
		}
			
			
			
		System.out.println(newnum);	
				
				
	}

}
