public class SubArr {
  public static void lenOfLongestSubarr(int[] arr, int key) {
    int len = 0;
    for(int i = 0;i<arr.length;i++){
        for(int j = i;j<=arr.length;j++){
          int sum = 0;
            for(int k = i;k<j;k++){
                sum += arr[k];
                System.out.print(arr[k]);
              }
              System.out.println();
            }
    }
}
  public static void main(String[] args) {
    int arr[] = {1,4,5,4,7};
    lenOfLongestSubarr(arr,9);
  }
}
