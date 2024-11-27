import java.math.BigDecimal;

public class BasicsDemo {
  int id1 = 0;

  int id = 0;
  int Id = 0;
  int ID = 0;

  void foo() {
  }

  void Foo() {
  }

  static void print() {
    System.out.println("\n\nInside print...");
    System.out.println("Hello, World!");
    System.out.println();
    System.out.print("Hello, World!");
    System.out.println("Hello,");
    System.out.print(" ");
    System.out.print("World!");
    System.out.println("");
  }

  static void primitives() {
    System.out.println("\n\nInside primitives...");

    long longHex = 0x0041L;
    System.out.println("longHex: " + longHex);

    int intBinary = 0b0100_0001;
    System.out.println("intBinary: " + intBinary);

    int intOctal = 0101;
    System.out.println("intOctal: " + intOctal);

    char charInt = 65;
    char charHex = 0x0041;
    char charBinary = 0b01000001;

    System.out.println("charInt: " + charInt);
    System.out.println("charHex: " + charHex);
    System.out.println("charBinary: " + charBinary);

    int intChar = 'A';
    System.out.println("intChar: " + intChar);
  }

  static void typeCasting() {
    System.out.println("\n\nInside typeCasting...");
    // Explicit casting
    long y = 42;
    // int x = y;
    int x = (int) y;

    // Information loss due to out-of-range assignment
    byte narrowedByte = (byte) 123456;
    System.out.println("narrowedByte: " + narrowedByte);

    // Truncation
    int iTruncated = (int) 0.99;
    System.out.println("iTruncated: " + iTruncated);

    // Implicit cast (int to long)
    y = x;

    // Implicit cast (char to int)
    char cChar = 'A';
    int iInt = cChar;
    System.out.println("iInt: " + iInt);

    // byte to char using an explicit cast
    byte bByte = 65;
    cChar = (char) bByte; // special conversion (widening from byte --> int followed by narrowing from int
                          // --> char)
    System.out.println("cChar: " + cChar);
  }

  static int count = 25;

  static int[] scores;

  static void arrays() {
    System.out.println("\n\nInside arrays...");
    // int[] scores = new int[4];

    scores = new int[4];

    // scores[0] = 90;
    // scores[1] = 70;
    // scores[2] = 80;
    // scores[3] = 100;

    // int[] scores = new int[] { 90, 70, 80, 100 };

    // int[] scores = { 90, 70, 80, 100 };

    System.out.println("Midterm 1: " + scores[0]);
    System.out.println("Midterm 2: " + scores[1]);
    System.out.println("Final: " + scores[2]);
    System.out.println("Project: " + scores[3]);
    System.out.println("Number of Exams: " + scores.length);

    Student[] students = new Student[3];

    students[0] = new Student();
    students[1] = new Student();
    students[2] = new Student();

    students[0].name = "John";
    students[1].name = "Raj";
    students[2].name = "Anita";

    System.out.println("Student 1: " + students[0].name);
    System.out.println("Student 2: " + students[1].name);
    System.out.println("Student 3: " + students[2].name);
  }

  public static void main(String[] args) {
    arrays();

    // count = 34;

    // if (count < 49) {
    // }

    // typeCasting();

    // System.out.println(1 - 0.9);
    // System.out.println(0.1 + 0.2);

    // double price = 1000;
    // double discountPercent = 0.9;
    // double discountAmount = price * discountPercent;

    // System.out.println(price - discountAmount);
    // System.out.println(price * (1 - discountPercent));

    // BigDecimal first = new BigDecimal("0.1");
    // BigDecimal second = new BigDecimal("0.2");

    // System.out.println(first.add(second));

    // primitives();

    // int i = 6;
    // int j = 2;
    // System.out.println(i + j);
    // System.out.println(i - j);
    // System.out.println(i * j);
    // System.out.println(i / j);
    // System.out.println(i % j);

    // print();
  }
}