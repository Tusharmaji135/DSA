public class SubArr {
  //Brute Forse
  public static void printSubArr(int nums[]) {
    
    int currSum = 0;
    int tp = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int start = i;
      for (int j = i; j < nums.length; j++) {
        int end = j;
        currSum = 0;
        for (int k = start; k <= end; k++) { // print
          currSum += nums[k];
          System.out.print("(" + nums[k] + ") "); // Sub Array
        }
        System.out.print("= "+currSum);
        if(currSum>maxSum){
          maxSum = currSum;
        }
        tp++;
        System.out.println();
      }
    }
    System.out.println("Total Pairs : " + tp);
    System.out.println("MAX : "+maxSum);
  }

  //Prefix Sum
  public static void printSubArrPre(int nums[]) {
    
    int currSum = 0;
    int tp = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[nums.length];

    prefix[0] = nums[0];
    //calculate prefix array
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i-1] + nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      int start = i;
      for (int j = i; j < nums.length; j++) {
        int end = j;
        
        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
        if(currSum>maxSum){
          maxSum = currSum;
        }
        tp++;
        System.out.println();
      }
    }
    System.out.println("Total Pairs : " + tp);
    System.out.println("MAX : "+maxSum);
  }

  //Kadans Algo
  public static void printSubArrKadans(int nums[]){
    int CS = 0;
    int max = Integer.MIN_VALUE;
    
    for (int i = 0; i < nums.length; i++) {   // [-2,-3,4,-1,-2,1,5,-3]
      CS += nums[i];
      max = Math.max(CS, max);
      if (CS < 0) {
        CS = 0;
      }
    }

    System.out.println("MAX SUM : "+max);
  }


  public static void main(String[] args) {
    // array ka koi bhi tukra jo continuos ho usse SUBARRAYS khete hai
    int nums[] = { -2,-3,4,-1,-2,1,5,-3};
    printSubArrKadans(nums);

  }
}
