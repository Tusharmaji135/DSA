public class PrimeNum {
  public static void main(String args[]) {
      int a = 11;
      boolean isPrime = true;

      // Check divisors from 2 to a-1
      for (int i = 2; i < a; i++) {
          if (a % i == 0) {
              isPrime = false; // Not a prime number
              break; // No need to check further
          }
      }

      // Output result based on the flag
      if (isPrime) {
          System.out.println("PRIME NUMBER");
      } else {
          System.out.println("NOT A PRIME NUMBER");
      }
  }
}
