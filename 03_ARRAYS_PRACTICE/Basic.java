import java.util.Arrays;

public class Basic {

  public static int[] rotateArray(int[] arr, int n) {
    int temp = arr[n-1];
    for (int i = n-1; i > 0; i--) {
        arr[i] = arr[i-1];
    }
    arr[0] = temp;
    System.out.println(1%7);
    return arr;
}

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    rotateArray(arr, arr.length);
    System.out.println(Arrays.toString(arr));
    
  }
}
