import java.util.Scanner;

public class Create {
  public static void creat(){
    // int num[] = {1,2,3};
    int marks[] = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < marks.length; i++) {
      marks[i] = sc.nextInt();
    }
    for (int i = 0; i < marks.length; i++) {
      System.out.print(marks[i]+" ");
    }
  }

  public static void update(int marks[]){
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;
    }
  }
  public static void main(String[] args) {
    int marks[] = {98,97,99};
    update(marks);
    for (int i = 0; i < marks.length; i++) {
      System.out.println(marks[i]);
    } 
  }
}
