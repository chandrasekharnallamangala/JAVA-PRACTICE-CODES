import java.util.Scanner;

public class VowelConsonant {
    static void Vowel(char c){
        if(isVowel(c)){
            System.out.println(c + " is Vowel");
        }
        else {
            System.out.println(c + " is consonant");
        }
    }
    static boolean isVowel(char c){
        c = Character.toUpperCase(c);
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        Vowel(ch);
    }
}
