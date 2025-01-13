
public class ShortestPath {
  public static void shortPath(String path) {
    int x = 0, y = 0;

    for (int i = 0; i < path.length(); i++) {
      char direction = path.charAt(i);
      switch (direction) {
        case 'S':
          y--;
          break;
        case 'N':
          y++;
          break;
        case 'W':
          x--;
          break;
        case 'E':
          x++;
          break;
        default:

          System.err.println("Enter Valid Directions (E,W,N,S)! ");
          break;
      }

    }

    // Displacement:

    int x2 = x * x;
    int y2 = y * y;
    System.out.println("Shortest Path : " + Math.sqrt(x2 + y2));

  }

  public static void main(String[] args) {
    String path = "WNEENESEN4NN";
    shortPath(path);
  }
}
