

import java.util.Arrays;
import java.util.Scanner;

public class DistinctElements {
    static void frequency(int[] arr,int n){
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        int dist = 0;
        for(int i=0; i<n; i++) {
            if(visited[i]){

                continue;
            }
            else{
                dist++;
                int count=1;
                for(int j=i+1; j<n; j++){
                    if(arr[i] == arr[j]){
                        visited[j]=true;
                        count++;
                    }
                }
                System.out.println(arr[i]+ " occurs " + count +" times");
            }
        }
        System.out.println(dist);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        frequency(arr,n);
    }
}

