import java.util.Scanner;

public class StringLength {
    static void stringlength(String str){
        int len = 0;
        for (char l : str.toCharArray()){
            len++;
        }
        System.out.println("String Length is : "+len);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        stringlength(str);
    }
}
