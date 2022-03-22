import java.util.*;

class hello {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.printf("insert one char%n");
    String input = s.nextLine();
    char c = input.charAt(0);
    String result = "";

    if (c >= '0' && c <= '9') result = "number";
    else if (c >= 'A' && c <= 'Z') result = "upper case alphabet";
    else if (c >= 'a' && c <= 'z') result = "lower case aplhabet";
    else result = "the other type";
    System.out.printf("type of inserted char %c is: %s", c, result);
  }
}