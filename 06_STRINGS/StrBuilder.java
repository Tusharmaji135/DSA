public class StrBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    // String str = "kaisa hai, bhai";
    // sb.toString();  //should be a object
    // System.out.println(sb);
    for (char ch = 'a'; ch <= 'z'; ch++) {
      sb.append(ch);
    }
    System.out.println(sb);
  }
}
