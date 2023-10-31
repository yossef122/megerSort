package sortAlgorithm;

public class megerSort {

    public static void main(String[] args) {
        int[] arr = {1, 25, 7, 4,25,266,159,753,14,123,6666,852,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
                System.out.println("\n");

    }

   
    static public void mergeSort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int midpoint = start + (end - start) / 2;
        mergeSort(arr, start, midpoint);
        mergeSort(arr, midpoint + 1, end);
        merge(arr, start, midpoint, end);
    }
//
    static public void merge(int[] arr, int start, int midpoint, int end) {
        int i = 0, j = 0, k = start;
        int left_length = midpoint - start + 1;

        int right_length = end - midpoint;

        int[] left_newArr = new int[left_length];

        int[] right_newArr = new int[right_length];

        for (; i < left_newArr.length; i++) {
            left_newArr[i] = arr[start + i];
        }
        for (; j < right_newArr.length; j++) {
            right_newArr[j] = arr[midpoint + 1 + j];
        }
        i = 0;
        j = 0;
        while (i < left_length && j < right_length) {

            if (left_newArr[i] <= right_newArr[j]) {
                arr[k] = left_newArr[i];
                i++;
            } else {
                arr[k] = right_newArr[j];
                j++;

            }
            k++;
        }

        while (i < left_length) {
            arr[k] = left_newArr[i];
            i++;
            k++;
        }

        while (j < right_length) {
            arr[k] = right_newArr[j];
            j++;
            k++;
        }
    }

}
