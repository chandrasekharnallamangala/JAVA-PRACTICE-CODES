import java.util.Scanner;
public class WalkinInRow {
    static int findingWidth(int[] arr1, int wallHeight) {
        int len = arr1.length;
        int width = 0;
        for (int i = 0; i < len; i++) {
            if (arr1[i] <= wallHeight) {
                width = width + 1;
            } else {
                width += 2;
            }
        }
        return width;

    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int wallheight = sc.nextInt();
            int Width = findingWidth(arr,wallheight);
            System.out.println(Width);
        }
    }
