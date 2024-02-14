// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

package codePractice;

import java.util.Scanner;

public class SingleNumber {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String inputLine = sc.nextLine();

        String[] elements = inputLine.split(",");
        int[] arr = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i].trim());
        }

        int singleNumber = findSingleNumber(arr);
         System.out.println(singleNumber);
        sc.close();
    }
}
