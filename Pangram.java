import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String alphabets = "abcdefghijklmnopqrstuvwxyz";

        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < alphabets.length(); i++) {
            if (str.indexOf((alphabets.charAt(i))) >= 0) {
                count++;
            }
            else{
                break;
            }
        }

        if (count == 26) {
            System.out.print("Given String Is Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}
