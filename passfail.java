package codePractice;

import java.util.*;
import java.util.Scanner;

public class passfail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int total[] = new int[n];
		 int marks[] = new int[n];
		 int require[] = new int[n];
		 
		 for(int i = 0; i < n; i++) {
			total[i] = sc.nextInt();
			marks[i] = sc.nextInt();
			require[i] = sc.nextInt();
			}
		 
		 for(int i = 0; i < n; i++) {
			 
			 int incorr = total[i] - marks[i];
			 
			 if(((marks[i] * 3) - incorr) >= require[i]) {
				 System.out.println("PASS");
			 }
				 else {
					 System.out.println("FAIL");
				 }
			 }
		 }
 	}


