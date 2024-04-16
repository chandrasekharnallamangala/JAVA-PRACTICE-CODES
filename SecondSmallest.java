
import java.util.Scanner;

public class SecondSmallest {
    static void secondSmall(int[] arr, int n) {
        int firstSmall = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        if (n < 2) {
            System.out.println("Size of array is not compatible for finding the second smallest element.");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < firstSmall) {
                secondSmall = firstSmall;
                firstSmall = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != firstSmall) {
                secondSmall = arr[i];
            }
        }

        if (secondSmall == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element in the array.");
        } else {
            System.out.println("Second smallest element is " + secondSmall);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid array size.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }

        secondSmall(arr, n);
    }
}
