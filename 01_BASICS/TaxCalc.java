import java.util.Scanner;

public class TaxCalc {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter Your Income : ");
      int income = sc.nextInt();
      double tax;
      if (income < 500000) {
        tax = 0;
      } else if (income >= 500000 && income < 1000000) {
        tax = income * 0.2;
      } else {
        tax = income * 0.3;
      }
      System.out.println("Tax : " + tax);
      System.out.println("Your Income : " + (income - tax));
    }

  }
}