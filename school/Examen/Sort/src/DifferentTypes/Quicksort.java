package DifferentTypes;

public class Quicksort {
    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int partionIndex = partition(arr, low, high);
            sort(arr, low, partionIndex - 1);
            sort(arr, partionIndex + 1, high);
        }
    }

    public static int partition(int [] arr, int low, int high) {
        int pivot = arr[high];
        int i = low -1;

        for (int j = low; j < high ; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);;
            }
        }
        swap(arr, i + 1, high);
        return  i + 1;
    }

    public static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

