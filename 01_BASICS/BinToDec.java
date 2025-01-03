public class BinToDec {
  public static void binToDec(int binNum){
    int pow =0;
    int decNum =0;
    while (binNum>0) {
      int lastdisgit = binNum%10;
      decNum = decNum + (lastdisgit* (int)(Math.pow(2, pow)));
      pow++;
      binNum = binNum/10;
    }
    System.out.println("Decimal of "+ binNum + " = " + decNum);
  }

  public static void main(String[] args) {
    binToDec(101);
  }
}
