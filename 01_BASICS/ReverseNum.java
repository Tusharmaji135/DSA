public class ReverseNum {
  public static void main(String[] args) {
    int n = 124578;
    int rem;
    String sum = "";
    while (n > 0) {
      rem = n % 10;
      sum += rem;
      n = n / 10;
    }
    System.out.println(sum + 2);
  }
}
