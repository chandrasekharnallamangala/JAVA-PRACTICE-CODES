import java.util.Scanner;

public class RemoveDuplicates {
    static void removedups(int[] arr,int n){
        int j = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j] = arr[n-1];
        for(int k=0;k<=j ;k++){
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        removedups(arr,n);
    }

}
