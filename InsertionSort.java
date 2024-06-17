public class InsertionSort {
    static void insertionSort(int[] arr) {

        //int k = 0;
        for (int j = 1; j < arr.length; j++) {
            int k = j - 1;
            int key = arr[j];
              while (k >= 0 && arr[k] > key) {
                arr[k + 1] = arr[k];
                k--;
            }
            arr[k+1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 11, 5, 4,6,3, 2, 10, 1};
        insertionSort(arr);
    }
}
