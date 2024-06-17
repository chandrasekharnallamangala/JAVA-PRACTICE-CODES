public class BubbleSort {

    static void bubble(int[] arr) {
        int len = arr.length;
        for(int i=0; i<len - 1; i++){ // we can use i < len-1 or i < len.since last element automatically sorted.
            for (int j=0; j<len-i-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<len; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,9,7,11,5,4,3,2,10,1};
        bubble(arr);
    }
}
