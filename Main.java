import java.util.Random;
import java.util.Arrays;

public class Main {

    public static int partition(int[] arr, int low, int high) {     // The Partition Method
        Random rand = new Random();
        int pivotIndex = low + rand.nextInt(high - low + 1);  // Chooses a random index
        int pivot = arr[pivotIndex];        // Sets that number at the random index as the pivot

        swap(arr, pivotIndex, high);        // Swaps the random pivot index with the highest number

        int i = low - 1;                    // This is the starting index of the quick sort, in this case -1

        for (int j = low; j < high; j++) {  // If the lower number is less than the higher number, then do this loop
            if (arr[j] <= pivot) {          // If the current iterative index is less than or is the pivot, then swap the current low with the high
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);           // After, swap the index that is above i and the highest index
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {              // Method to swap two things in an array
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high) {    // Recursively quick sorts & partitions the array using a random index until sorted
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void populateArray(int[] unsortedArray) {               // Method to populate an array
        Random rand = new Random();
        for (int x = 0; x < unsortedArray.length; x++) {          // Populates the array with random integers
            unsortedArray[x] = rand.nextInt(0, 100);
        }
    }

    public static void main(String[] args) {    // The Main Function & Prints results
        int[] randArray = new int[10];      // New array that is empty of 10 available positions (ArrayLists would have been more fun)
        populateArray(randArray);           // Populates the array with random integers
        System.out.println("Original Array:  " + Arrays.toString(randArray));
        quickSort(randArray, 0, randArray.length - 1);
        System.out.println("New Array: " + Arrays.toString(randArray));
    }

}
