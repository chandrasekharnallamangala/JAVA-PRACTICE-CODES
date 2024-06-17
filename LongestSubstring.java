import java.util.Scanner;

public class LongestSubstring {
    static String longsubstring(String str) {

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                if (temp.indexOf(str.charAt(j)) == -1) {
                    temp += str.charAt(j);
                } else {
                    break;
                }
            }
            if (res.length() < temp.length()) {
                res = temp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String longString = longsubstring(str);
        System.out.println("Longest Non repeating substring is  :" + longString);

    }
}
