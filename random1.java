package codePractice;
import java.util.Scanner;
public class random1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*minimum value for generating random value*/
		int min = 1;
		
		//maximum value for generating random value
		int max = 100;
		
		boolean flag = false;
		int score = 0;//initialise score to zero
		
		// loop will continues until 'NO'
		while (true){
			
			//Limiting the number of attempts by entering the limit value
			System.out.print("Enter the limit :");
			int limit =sc.nextInt();
			
			int attempts = 0;
			
			//random method will generates a random value between specified minimum and maximum values
			int random = (int)(Math.random()*(max-min+1)+min);
			
		    //Loop will continues until limit value
			while(attempts < limit) {
				
				System.out.println("Your attempt number  :"+(attempts+1));
				
				//entering guessing value
				int guess = sc.nextInt();
				
				//if generated random value and guessed value are equal,break the inner loop 
				if (guess == random) {
					score++;
					System.out.println("Hurrah! your guess is correct");
					flag = true;
					break;
				}
				
				else if(guess < random) {
					System.out.println("your guessing number is lower than random number");
				}
				
				else {
					System.out.println("your guessing  number is greater than random number ! ");
				}
				
				//increasing attempt value
				attempts++;
		
			}//End of inner while loop
		
			if (flag) {
				System.out.println("you got "+score+ " points");
			}
			
			//if random value is not guessed
			else {
				
				System.out.println("Oops! you cannot guess the number");
				System.out.println("you got "+score+ " points");//Displaying scores
			}
			
			//Adding more rounds by taking decisions from user 
			System.out.print("Do you want to continue this Game?(Y/N) :");
			String choice = sc.next(); 
			
			if (choice.equalsIgnoreCase("n")) {
				break;
			}
			
		}//End of Game
	}
}
