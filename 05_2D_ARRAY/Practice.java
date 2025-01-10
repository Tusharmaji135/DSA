import java.util.Arrays;

public class Practice {
  public static void main(String[] args) {
    int[][] nums = { { 4, 7, 8 },
                      { 11, 4, 3 },
                       { 1, 1, 1 },};
    //Q1 find count of 7s------------------------------------------
    // int count=0;
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = 0; j < nums[0].length; j++) {
    // if(nums[i][j]==7){
    // count++;
    // }
    // }
    // }
    // System.out.println("COUNT : "+count);

     //Q2 sum of index 2 ------------------------------------------
    // int sum = 0;
    // int rowIndex = 1; // 2nd row index
    // for (int i = 0; i < nums[rowIndex].length; i++) {
    //     sum += nums[rowIndex][i];
    // }
    // System.out.println("COUNT : "+sum);

     //Q3 transpose------------------------------------------
    int row = nums.length;
    int col = nums[0].length;
    int transpose[][] = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        transpose[j][i] = nums[i][j];
      }
    }
    System.out.println(Arrays.deepToString(transpose));
  }
}
