//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


package codePractice;
import java.util.Scanner;
public class miss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       
        String inputLine = sc.nextLine();

        String[] elements = inputLine.split(",");
        int[] arr = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i].trim());
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        int ls = arr.length ;
        int tot = (ls*(ls+1))/2;
        int res = tot - sum;
        System.out.println(res);
    }
}