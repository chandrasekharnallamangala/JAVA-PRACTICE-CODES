import java.util.Scanner;

public class MergedArrays {
    static int[] mergedArray(int[] arr1,int[] arr2){
        int i=0, j=0, k=0;
        int res[] = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
                k++;
            } else {
                res[k] = arr2[j];
                j++;
                k++;
            }
        }

            while (i < arr1.length) {
                res[k] = arr1[i];
                i++;
                k++;
            }

            while (j < arr2.length) {
                res[k] = arr2[j];
                j++;
                k++;
            }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {3,5,9,12,15};
        int[] arr2 = {1,6,8};
        int[] res = mergedArray(arr1,arr2);

        for(int i = 0; i < res.length;i++){
            System.out.println(res[i]);
        }
    }
}
