public class SerInSortedMat {

  public static boolean searchSortedArr(int[][] mat, int key) {
    // brute force-------------------------------------------
    // int n = mat.length;
    // int m = mat[0].length;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (key == mat[i][j]) {
    // System.out.println(key + " Found At : ("+i+","+j+")");
    // return true;
    // }
    // }
    // }
    // System.out.println("NOT FOUND");
    // return false;

    // row-wise--------------------------------------------
    // for (int i = 0; i < mat.length; i++) {
    // int low = 0;
    // int high = mat[i].length - 1;
    // while (low <= high) {
    // int mid = (low + high) / 2;
    // if (mat[i][mid] == key) {
    // System.out.println(key + " Found At: (" + i + "," + mid + ")");
    // return true;
    // } else if (mat[i][mid] < key) {
    // low = mid + 1;
    // } else {
    // high = mid - 1;
    // }
    // }
    // }
    // System.out.println("NOT FOUND");
    // return false; // Return false to indicate the key is not present

    // staircase Search-----------------------------------------------
    int row = 0;
    int col = mat[0].length - 1;
    while (row < mat.length && col >= 0) {
      if (mat[row][col] == key) {
        System.out.println(key + " Found At : (" + row + "," + col + ")");
        return true;
      } else if (key < mat[row][col]) {
        col--;
      } else {
        row++;
      }
    }
    System.out.println("NOT FOUND");
    return false;

  }

  // binary search staircase Search
  public static void main(String[] args) {
    int matrix[][] = {
        { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 27, 29, 37, 48 },
        { 32, 33, 39, 50 }
    };

    searchSortedArr(matrix, 33);
  }
}
