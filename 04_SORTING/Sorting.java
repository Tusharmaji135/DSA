import java.util.*;

public class Sorting {

  // Selection Sort implementation
  public static void selectionSort(Integer arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i; // Assume the first element of the unsorted part is the smallest
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          min = j; // Update the index of the smallest element
        }
      }
      // Swap the smallest element with the first element of the unsorted part
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }

  // Bubble Sort implementation
  public static void bubbleSort(Integer arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      boolean didSwap = false; // Track if any swaps were made in the current pass
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          // Swap elements if they are in the wrong order
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          didSwap = true;
        }
      }
      // Exit early if no swaps were made (array is already sorted)
      if (!didSwap) {
        break;
      }
    }
  }

  // Insertion Sort implementation
  public static void insertionSort(Integer arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i]; // Current element to be inserted
      int prev = i - 1;
      // Shift elements of the sorted part to the right to create the correct position
      while (prev >= 0 && arr[prev] > temp) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      // Insert the current element into the correct position
      arr[prev + 1] = temp;
    }
  }

  // Counting Sort implementation (only works for non-negative integers)
  public static void countingSort(Integer arr[]) {
    // Find the largest number in the array
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }

    // Create a frequency array
    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    // Sort the array using the frequency array
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
    Integer arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

    // selectionSort(arr);
    // bubbleSort(arr);
    // insertionSort(arr);
    // Arrays.sort(arr, Collections.reverseOrder()); // Sort in descending order
    countingSort(arr);

    // Print the sorted array
    System.out.println(Arrays.toString(arr));
  }
}
