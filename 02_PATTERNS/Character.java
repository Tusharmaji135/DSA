
public class Character {
  public static void main(String[] args) {
    char counter = 'A';
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }

  public static Object toUpperCase(char charAt) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'toUpperCase'");
  }
}
