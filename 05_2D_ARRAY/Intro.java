import java.util.Arrays;
import java.util.Scanner;

public class Intro {

  public static boolean search(int[][] mat, int key) {
    //brute force
    int n = mat.length;
    int m = mat[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (key == mat[i][j]) {
          System.out.println(key + " Found At : ("+i+","+j+")");
          return true;
        }
      }
    }
    System.out.println("NOT FOUND");
    return false;
  }

  public static void maximum(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (max < mat[i][j]) {
          max = mat[i][j];
        }
      }
    }
    System.out.println("MAXIMUM : "+max);
  }

  public static void main(String[] args) {
    int mat[][] = new int[3][3];
    int n = mat.length;
    int m = mat[0].length;

    try (Scanner sc = new Scanner(System.in)) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          mat[i][j] = sc.nextInt();
        }
      }
    }
    // output
    System.out.println(Arrays.deepToString(mat));
    search(mat, 10);
    maximum(mat);
  }

}
 