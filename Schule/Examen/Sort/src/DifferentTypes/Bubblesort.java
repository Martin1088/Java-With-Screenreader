package DifferentTypes;

public class Bubblesort {
    public static int[] sort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[ j ] = arr[ j+1 ];
                    arr[ j+1 ] = temp;
                }
            }
        }
        return arr;
    }


}
