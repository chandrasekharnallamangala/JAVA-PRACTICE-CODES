import java.util.Scanner;

public class StringPalindrome {
    static void stringpalindrome(String str){
        char[] ch = str.toCharArray();
        int mid = (ch.length)/2;
        int i=0,j=ch.length-1;
        while (i < j){
            if(ch[i] == ch[j]){
                i++;
                j--;
            }
            else {
                break;
            }

        }
        if(i == mid){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        stringpalindrome(str);
    }

}
