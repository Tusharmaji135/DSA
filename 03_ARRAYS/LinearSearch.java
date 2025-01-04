public class LinearSearch {
  public static int linearSearch(int numbers[], int key) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
        return i;
      }
    }
    return -1;
  }
  
  public static int linearSearchStr(String fruits[], String faal) {
    for (int i = 0; i < fruits.length; i++) {
      if (fruits[i] == faal) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    int key = 12;
    int index = linearSearch(numbers, key);
    if (index == -1) {
      System.out.println("NOT FOUND");
    } else {
      System.out.println("Key is at index " + index);
    }
  }
}
