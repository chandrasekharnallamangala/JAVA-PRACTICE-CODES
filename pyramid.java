package codePractice;
import java.util.Scanner;
public class pyramid {

	public static void main(String[] args) {
        
        System.out.println("enter number of rows and columns");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i = 0; i <= n;i++) {
        	for(j = 0; j <= i; j++) {
        		System.out.print("*");
        	}
    
System.out.println(" ");
	}

}
}