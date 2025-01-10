public class DiagnolSum {
  public static void DiagnolS(int[][] matrix) {
    int sum = 0;

    //Brute Force :-----------------------------------------------
    // for (int i = 0; i < matrix.length; i++) {
    //   for (int j = 0; j < matrix[0].length; j++) {
    //     //primary Diagnol
    //     if (i == j) {
    //       sum += matrix[i][j];
    //     }
    //     //Secondary Diagnol
    //     else if ((i+j)==matrix.length-1) {
    //       sum += matrix[i][j];  
    //     }
    //   }
    // }


    for (int i = 0; i < matrix.length; i++) {
      //pd
      sum+=matrix[i][i];
      //sd
      if (i!=matrix.length-i-1) {   //insure that mid ele not repet i==j
        sum+=matrix[i][matrix.length-1-i];    //i+j = n-1 then j = n-1-i;
      }
    }
    System.out.println("Diagnol SUM: "+sum);
  }

  public static void main(String[] args) {
    int matrix[][] = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };
    DiagnolS(matrix);
  }

}
