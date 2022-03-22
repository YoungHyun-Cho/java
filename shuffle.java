import java.util.*;

class Shuffle {
  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    for (int i = 0; i < arr.length; i++) {
      int random = (int)(Math.random() * 10);
      int temp = arr[i];
      arr[i] = arr[random];
      arr[random] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}