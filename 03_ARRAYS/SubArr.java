public class SubArr {
  public static void printSubArr(int nums[]) {
    int tp = 0;
    for (int i = 0; i < nums.length; i++) {
      int start = i;
      for (int j = i; j < nums.length; j++) {
        int end = j;
        int sum = 0;
        for (int k = start; k <= end; k++) { // print
          sum += nums[k];
          System.out.print("(" + nums[k] + ") "); // Sub Array
        }
        System.out.print("= "+sum);
        tp++;
        System.out.println();
      }
    }
    System.out.println("Total Pairs : " + tp);
  }

  public static void main(String[] args) {
    // array ka koi bhi tukra jo continuos ho usse SUBARRAYS khete hai
    int nums[] = { 2, 4, 6, 8, 10 };
    printSubArr(nums);

  }
}
