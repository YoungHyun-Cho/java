import java.util.*;

class SumAndAverage {
  public static void main(String[] args) {
    int sum = 0;
    int average = 0;
    int[] randomArr = new int[20];
    
    for (int i = 0; i < randomArr.length; i++) {
      randomArr[i] = (int)(Math.random() * 10);
      sum += randomArr[i];
      System.out.printf("%d ", randomArr[i]);
    }

    average = sum / randomArr.length;
    System.out.println();
    System.out.println("sum : " + sum);
    System.out.println("ave : " + average);
  }
}