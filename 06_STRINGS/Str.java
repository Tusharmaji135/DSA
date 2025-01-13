// import java.util.Scanner;

import java.util.Arrays;

public class Str {
  
  public static void main(String[] args) {
    char arr[] = {'a','b','v'};
    String str = "gyyyy";
    String str2 = new String("uuu");

    //Strings are immutable
    str2 = "hihiih";
    System.out.println(str2+arr[0]+str);

    //in out
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();  //single word : tonyy
    // String name = sc.nextLine();  //whole word : tonyy kakkar
    String name =  "Tushar";
    // System.out.println("NAME : "+name.length());
    // System.out.println("NAME : "+name.concat(str2)); //or name + str2
    // System.out.println(name.charAt(1));
    // for (int i = 0; i < name.length(); i++) {
    //   System.out.print(name.charAt(i)+"-");
    // }
    // System.out.println(Arrays.sort(name.toCharArray()));

  }
}
