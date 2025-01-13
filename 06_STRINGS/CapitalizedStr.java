public class CapitalizedStr {
  public static String capitalized(String str) {
    if (str == null || str.isEmpty()) {
      return str; // Return as-is if string is null or empty
    }

    StringBuilder sb = new StringBuilder();
    // Capitalize the first character
    sb.append(Character.toUpperCase(str.charAt(0)));

    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        // Append the space
        sb.append(str.charAt(i));
        // Capitalize the next character
        sb.append(Character.toUpperCase(str.charAt(i + 1)));
        i++; // Skip the next character as it's already added
      } else {
        sb.append(str.charAt(i));
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    String str = "hi, i am tushar";
    System.out.println("Original String: " + str);
    String capitalizedStr = capitalized(str);
    System.out.println("Capitalized String: " + capitalizedStr);
  }
}
