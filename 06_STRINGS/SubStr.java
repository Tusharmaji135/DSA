public class SubStr {
  public static String substr(String str, int startInd, int endInd) {
    String sStr = "";
    for (int i = startInd; i < endInd; i++) {
      sStr += str.charAt(i);
    }
    return sStr;
  }

  public static void main(String[] args) {
    String str = "Hello World";
    System.out.println(str);
    System.out.println("Substr : " + substr(str, 6, 11) + " " + str.substring(0, 5));
  }
}