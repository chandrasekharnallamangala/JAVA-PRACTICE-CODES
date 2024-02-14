//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

 

//Increment the large integer by one and return the resulting array of digits.

package codePractice;

import java.util.Arrays;
import java.util.Scanner;

public class IncrementLargeInteger {

    public static int[] incrementLargeInteger(int[] digits) {
        int n = digits.length;
        int carry = 1; // Initialize the carry to 1 since we want to increment the number by 1.

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum == 10) {
                carry = 1;
                digits[i] = 0;
            } else {
                carry = 0;
                digits[i] = sum;
                break; // No need to continue iterating since there are no leading zeros.
            }
        }

        // If there is still a carry left after the loop, we need to add a new digit at the beginning.
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();

        String[] elements = inputLine.split(",");
        int[] arr = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i].trim());
        }

        int[] result = incrementLargeInteger(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
    }
}
