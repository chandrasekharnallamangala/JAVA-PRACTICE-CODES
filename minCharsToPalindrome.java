//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class minCharsToPalindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        char[] ch = str.toCharArray();
//        int i=0;
//        Arrays.sort(ch);
//        int count = 0;
//        while (i < ch.length-1){
//            if(ch[i] == ch[i+1]) {
//                i+=2;
//            }
//            else {
//                count++;
//                i++;
//            }
//        }
//
//        if(count <= 1) {
//            System.out.println("It is already a palindrome");
//        }
//
//        else {
//            System.out.println(count-1 +" characters are required to make it palindrome");
//        }
//    }
//}

//
//import java.util.Scanner;
//
//public class minCharsToPalindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        sc.close();
//
//        // Find the minimum number of characters to be added
//        int count = minCharsToAdd(str);
//
//        if (count == 0) {
//            System.out.println("It is already a palindrome");
//        } else {
//            System.out.println(count + " characters are required to make it palindrome");
//        }
//    }
//
//    private static int minCharsToAdd(String str) {
//        int n = str.length();
//        int i = 0, j = n - 1;
//        int count = 0;
//
//        while (i < j) {
//            if (str.charAt(i) == str.charAt(j)) {
//                i++;
//                j--;
//            } else {
//                if (str.charAt(i + 1) == str.charAt(j)) {
//                    i++;
//                } else if (str.charAt(i) == str.charAt(j - 1)) {
//                    j--;
//                } else {
//                    i++;
//                }
//                count++;
//            }
//        }
//
//        return count;
//    }
//}



//import java.util.Arrays;
//import java.util.Scanner;
//
//public class minCharsToPalindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        sc.close();
//
//        char[] ch = str.toCharArray();
//        Arrays.sort(ch); // Sort the characters
//
//        int count = 0;
//        int i = 0;
//
//        // Count frequencies of characters
//        while (i < ch.length) {
//             int j = i;
//            while (j < ch.length && ch[j] == ch[i]) {
//                j++;
//            }
//            // If frequency is odd, increase the count
//            if ((j - i) % 2 != 0) {
//                count++;
//            }
//            i = j;
//        }
//
//        // Calculate the minimum number of insertions required
//        int minInsertions = Math.max(0, count - 1);
//
//        if (minInsertions == 0) {
//            System.out.println("It is already a palindrome");
//        } else {
//            System.out.println(minInsertions + " characters are required to make it palindrome");
//        }
//    }
//}

import java.util.Scanner;

public class minCharsToPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        // Find frequencies of each character
        int[] freq = new int[256]; // Assuming ASCII character set

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Count characters with odd frequencies
        int count = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] % 2 != 0) {
                count++;
            }
        }

        // Calculate the minimum number of insertions required
        int minInsertions = Math.max(0, count - 1);

        if (minInsertions == 0) {
            System.out.println("It is already a palindrome");
        } else {
            System.out.println(minInsertions + " characters are required to make it palindrome");
        }
    }
}

