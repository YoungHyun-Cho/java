import java.util.*;

class DrawShape {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String input;
    do {
      System.out.printf("Choose circle or triangle (c / t): ");
      input = s.nextLine();
    } while (!(input.equals("c") || input.equals("t")));

    if (input.equals("c")) {
      System.out.println("insert the center point and radius.");
      System.out.print("x: ");
      int x = s.nextInt();
      System.out.print("y: ");
      int y = s.nextInt();
      System.out.print("r: ");
      int r = s.nextInt();
      Circle c = new Circle(new Point(x, y), r);
      c.draw();
    }
    else {
      System.out.println("insert the three points");
      Point[] p = new Point[3];
      for (int i = 0; i < 3; i++) {
        System.out.printf("point %d%n", i + 1);
        System.out.print("x: ");
        int x = s.nextInt();
        System.out.print("y: ");
        int y = s.nextInt();
        p[i] = new Point(x, y);
      }
      Triangle t = new Triangle(p);
      t.draw();
    }
  }
}

class Shape {
  String color = "black";
  void draw() {
    System.out.printf("color: %s%n", color);
  }
}

class Point {
  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Point() {
    this(0, 0);
  }

  String getXY() {
    return "(" + x + ", " + y + ")";
  }
}

class Circle extends Shape {
  Point center;
  int r;

  Circle(Point center, int r) {
    this.center = center;
    this.r = r;
  }

  Circle() {
    this(new Point(0, 0), 100);
  }

  void draw() {
    System.out.printf("center: %s%nr: %d%ncolor: %s%n", center.getXY(), r, color);
  }
}

class Triangle extends Shape {
  Point[] p = new Point[3];
  
  Triangle(Point[] p) {
    this.p = p;
  }

  void draw() {
    System.out.printf("color: %s%n", color);
    for (int i = 0; i < 3; i++) {
      System.out.printf("p[%d]: %s%n", i, p[i].getXY());
    }
  }
}