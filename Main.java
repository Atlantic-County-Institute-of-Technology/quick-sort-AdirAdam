import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static int partition(int[] arr, int low, int high) {
        Random rand = new Random();
        int pivotIndex = low + rand.nextInt(high - low + 1);
        int pivot = arr[pivotIndex];

        swap(arr, pivotIndex, high);

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] unsortedArray = new int[10];
        Random rand = new Random();
        for (int x = 0; x < 10; x++) {
            unsortedArray[x] = rand.nextInt(0, 100);
        }
        System.out.println("Original Array:  " + Arrays.toString(unsortedArray));

        quickSort(unsortedArray, 0, unsortedArray.length - 1);
        System.out.println("New Array: " + Arrays.toString(unsortedArray));

    }

}
