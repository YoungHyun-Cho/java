import java.util.*;

class Hello {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Time t = new Time();
    
    System.out.print("insert hour : ");
    String hour = s.nextLine();
    System.out.print("insert min : ");
    String min  = s.nextLine();
    System.out.print("insert second : ");
    String sec = s.nextLine();

    t.setHour(Integer.parseInt(hour));
    t.setMinute(Integer.parseInt(min));
    t.setSecond(Integer.parseInt(sec));

    System.out.printf("%s %d:%d:%d%n", Time.str, t.getHour(), t.getMinute(), t.getSecond());
  }
}

class Time {
  private int hour;
  private int minute;
  private int second;
  public static String str = "Inserted time is";

  public int getHour() { return hour; }
  public int getMinute() { return minute; }
  public int getSecond() { return second; }
  
  public boolean isValid(int n, String type) {
    if (type.equals("h") && 0 <= n && n <= 23) return true;
    else if (type.equals("ms") && 0 <= n && n <= 59) return true;
    return false;
  }

  public void setHour(int h) {
    if (isValid(h, "h")) hour = h;
    else System.out.println("insert correct hour");
  }

  public void setMinute(int m) {
    if (isValid(m, "ms")) minute = m;
    else System.out.println("insert correct minute");
  }

  public void setSecond(int s) {
    if (isValid(s, "ms")) second = s;
    else System.out.println("insert correct second");
  }
}