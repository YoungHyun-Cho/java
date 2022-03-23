import java.util.*;

class hello {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Loop1:
    while (true) {
      System.out.printf("Insert expression (Ex. 1+1, 2*3.4)");
      String str = scanner.nextLine();
      String[] splited;

      Loop2:
      for (int i = 0; i < str.length(); i++) {
        switch (str.charAt(i)) {
          case '+':
            splited = str.split("\\+");
            if (checkIsDouble(str)) {
              double operand1 = Double.parseDouble(splited[0]);
              double operand2 = Double.parseDouble(splited[1]);
              System.out.printf("%f%n", operand1 + operand2);
            }
            else {
              int operand1 = Integer.parseInt(splited[0]);
              int operand2 = Integer.parseInt(splited[1]);
              System.out.printf("%d%n", operand1 + operand2);
            }
            break Loop2;
          case '-':
            splited = str.split("\\-");
            if (checkIsDouble(str)) {
              double operand1 = Double.parseDouble(splited[0]);
              double operand2 = Double.parseDouble(splited[1]);
              System.out.printf("%f%n", operand1 - operand2);
            }
            else {
              int operand1 = Integer.parseInt(splited[0]);
              int operand2 = Integer.parseInt(splited[1]);
              System.out.printf("%d%n", operand1 - operand2);
            }
            break Loop2;
          case '*':
            splited = str.split("\\*");
            if (checkIsDouble(str)) {
              double operand1 = Double.parseDouble(splited[0]);
              double operand2 = Double.parseDouble(splited[1]);
              System.out.printf("%f%n", operand1 * operand2);
            }
            else {
              int operand1 = Integer.parseInt(splited[0]);
              int operand2 = Integer.parseInt(splited[1]);
              System.out.printf("%d%n", operand1 * operand2);
            }
            break Loop2;
          case '/':
            splited = str.split("\\/");
            if (splited[1].equals("0")) {
              System.out.println("Cannot divide by 0");
              continue Loop1;
            }
            else if (checkIsDouble(str)) {
              double operand1 = Double.parseDouble(splited[0]);
              double operand2 = Double.parseDouble(splited[1]);
              System.out.printf("%f%n", operand1 / operand2);
            }
            else {
              int operand1 = Integer.parseInt(splited[0]);
              int operand2 = Integer.parseInt(splited[1]);
              System.out.printf("%f%n", operand1 / (double)operand2);
            }
            break Loop2;
          case '%':
            splited = str.split("\\%");
            if (splited[1].equals("0")) {
              System.out.println("Cannot divide by 0");
              continue Loop1;
            }
            else if (checkIsDouble(str)) {
              double operand1 = Double.parseDouble(splited[0]);
              double operand2 = Double.parseDouble(splited[1]);
              System.out.printf("%f%n", operand1 % operand2);
            }
            else {
              int operand1 = Integer.parseInt(splited[0]);
              int operand2 = Integer.parseInt(splited[1]);
              System.out.printf("%f%n", operand1 % (double)operand2);
            }
            break Loop2;
          default: continue;
        }
      }
      do {
        System.out.println("Try again? (y/n)");
        String action = scanner.nextLine();
        if (action.equals("y")) continue Loop1;
        else if (action.equals("n")) break Loop1;
        else System.out.println("Insert only y or n");
      } while (true);
    }
  }

  static boolean checkIsDouble(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '.') return true;
    }
    return false;
  }
}
