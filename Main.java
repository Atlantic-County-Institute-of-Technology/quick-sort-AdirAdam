import java.util.Random;
import java.util.ArrayList;

public class Main {

    public int partition(int[] arr, int low, int high) {
        Random rand = new Random();
        int pivotIndex = rand.nextInt(0, arr.length - 1);
        int pivot = arr[pivotIndex];

        swap(arr, pivotIndex,high);

        
//        ArrayList<Integer> usedPivots = new ArrayList<Integer>();



        return -1;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void quickSort(int[] arr, int low, int high) {

    }

    public static void main(String[] args) {
        System.out.println("uh huh");
    }

}


