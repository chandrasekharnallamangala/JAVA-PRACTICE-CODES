import java.util.Scanner;

public class LongPalindrome {

    // checking the string is palindrome or not
    static boolean isPalindrome(String str) {
        char[] ch = str.toCharArray();
        int i=0;
        int j=ch.length-1;

        while (i < j) {
            if(ch[i] != ch[j]) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    // Extracting substrings from the given String
    static String substring(String str) {
        String res = "";
        for(int i=0; i<str.length(); i++) {
            for(int j=i; j<str.length(); j++) {
                String temp = str.substring(i,j+1);
                System.out.println(temp);

                // calling ispalindrome method to check the substring is palindrome or not
                if(isPalindrome(temp)) {

                    // comparing the palindromes lengths
                    if(temp.length() > res.length()) {
                        res = temp;
                    }
                }

            }

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String longpalin = substring(str);
        System.out.println("Longest palindrome is :"+longpalin);


    }
}
