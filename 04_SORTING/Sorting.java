import java.util.Arrays;
import java.util.Collections;

public class Sorting {

  public static void selectionSort(Integer arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) { // Start j from i+1 to avoid redundant comparison
        if (arr[j] < arr[min]) {
          min = j; // Update min index if a smaller element is found
        }
      }
      // Perform swap only once per outer loop iteration
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }

  public static void bubbleSort(Integer arr[]) {
    // Get the length of the array
    int n = arr.length;

    // Outer loop to iterate through the entire array
    for (int i = 0; i < n - 1; i++) {
      // Initialize a flag to track if any swaps were made in this iteration
      boolean didSwap = false;

      // Inner loop to compare adjacent elements
      // Start from the current position `i` and go up to the last unsorted element
      for (int j = i + 1; j < n; j++) {
        // Check if the current element is greater than the next element
        if (arr[i] > arr[j]) {
          // Swap the two elements to place the smaller element before the larger one
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          // Mark that a swap was performed
          didSwap = true;
        }
      }
      // If no swaps were made during this iteration, the array is already sorted
      if (!didSwap) {
        break;
      }
    }
  }

  public static void insertionSort(Integer arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int prev = i - 1;
      while (prev >= 0 && arr[prev] > temp) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      arr[prev + 1] = temp;
    }
  }

  public static void countingSort(Integer arr[]) {

    // get largest number
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }

    //frequency array
    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++; 
    }

    // sorting
    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void main(String[] args) {
    Integer arr[] = {1,4,1,3,2,4,3,7 };

    // selectionSort(arr);
    // bubbleSort(arr);
    // insertionSort(arr);
    // Arrays.sort(arr, Collections.reverseOrder());
    countingSort(arr);

    System.out.println(Arrays.toString(arr));
    


  }

}
