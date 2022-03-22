import java.util.*;

class MaxAndMin {
  public static void main(String[] args) {
    int[] randomArr = new int[20];

    for (int i = 0; i < randomArr.length; i++)
      randomArr[i] = (int)(Math.random() * 1000);

    int max = randomArr[0];
    int min = randomArr[0];

    for (int i = 0; i < randomArr.length; i++) {
      System.out.printf("%d ", randomArr[i]);
      if (randomArr[i] > max) max = randomArr[i];
      else if (randomArr[i] < min) min = randomArr[i];
    }
    System.out.println();
    System.out.println("max : " + max);
    System.out.println("min : " + min);
  }
}