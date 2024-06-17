public class SelectionSort {
    static void selectionSort(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            int min = i;
            for(int j=i+1; j < arr.length;j++){
                if(arr[j] < arr[min]){
                    min=j;
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 11, 5, 4,6,3, 2, 10, 1};
        selectionSort(arr);
    }
}
