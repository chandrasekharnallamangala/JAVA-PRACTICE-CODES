import java.util.Scanner;

public class LongestPalindrome {
    static void largestpalindrome(int[] arr,int n){
        int res = -1;
        for(int i=0; i<n; i++){

            if((arr[i] > res) && ispalindrome(arr[i])) {
                res = arr[i];

            }
        }
        System.out.println("Longest Palindrome in the given array is :"+res);

    }
    static boolean ispalindrome(int ele){
        int temp = ele;

        int res = 0;
        while(ele > 0){
            int rem = ele % 10;
            res = res * 10+rem;
            ele /=10;
        }
        return res == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        largestpalindrome(arr,n);
    }
}
