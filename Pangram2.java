import java.util.Arrays;
import java.util.Scanner;

public class Pangram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read String with spaces and alphabets only
        String str1 = sc.nextLine();
        String str ="";

        // Removing spaces from the String.
        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) != ' ') {
                str = str + str1.charAt(i);
            }
        }
        str = str.toLowerCase();
        int[] frequency = new int[26];
        //Arrays.fill(frequency,0);

        // Calculating the frequencies
        for (int i=0; i<str.length(); i++) {
            frequency[((int)str.charAt(i)) - 'a']++;
        }

        // Checking the frequencies
        int count=0;
        for (int j=0; j<frequency.length; j++){
            if(frequency[j] == 0) {
                count++;
            }
        }

        if(count == 0) {
            System.out.println("pangram");
        }
        else {
            System.out.println("Not a pangram");
        }

    }
}
