import java.util.Scanner;

public class StringReverse2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();

        int i = 0;
        int j = str.length()-1;
        int flag = 0;
        while (i <= j){
            if(str.charAt(i) != str.charAt(j)){
                flag = 0;
                break;

            }
            i++;
            j--;
            flag = 1;
        }
        if(flag == 1){
            System.out.println("String palindrome");
        }
        else {
            System.out.println("Not a string palindrome");
        }
    }
}
