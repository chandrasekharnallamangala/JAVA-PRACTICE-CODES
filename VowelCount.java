import java.util.Scanner;

public class VowelCount {
    static void Vcount(String str){
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i=0; i<ch.length;i++) {

            if (isVowel(str.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Vcount(str);
    }
}
