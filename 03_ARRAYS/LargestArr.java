public class LargestArr {
  public static int getLargest(int arr[]) {
    int large = Integer.MIN_VALUE; // -infinity
    int small = Integer.MAX_VALUE; // +infinity
    for (int i = 0; i < arr.length; i++) {
      if (large < arr[i]) {
        large = arr[i];
      }
      if (small > arr[i]) {
        small = arr[i];
      }
    }
    System.out.println("Smallest Number is " + small);
    return large;

  }

  public static void main(String[] args) {
    int arr[] = { 10, 6, 8, 8, 9, 5, 2, 10, 6 };
    int largest = getLargest(arr);
    System.out.println("Largest Number is " + largest);

  }
}
