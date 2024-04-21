import java.util.Scanner;

public class CapitalFirstLast {
    static void capsfirstlast(String str) {

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int k = i;
            while (i < ch.length && ch[i] != ' ') {
                i++;
            }
            ch[k] = (ch[k] >= 'a' && ch[k] <= 'z' ? (char) ((int) ch[k] - 32) : ch[k]);
            ch[i-1] = (ch[i - 1] >= 'a' && ch[i - 1] <= 'z' ? (char) ((int) ch[i - 1] - 32) : ch[i - 1]);

        }
        for(char c : ch) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        capsfirstlast(str);
    }
}
