// Given two integers a and b, return the sum of the two integers without using the operators + and -.


package codePractice;

import java.util.Scanner;
class Solution {
    public static int getSum(int a, int b) {
        while ((a&b) != 0) {
            int olda = a;
            a = olda^b;
            b = (olda&b) << 1;
        }
        return a|b;
    }
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    sc.useDelimiter(",\\s*");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = getSum(a,b);
    System.out.print(c);
    }
}