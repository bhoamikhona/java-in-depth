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

  static void threeDimensionalArrays() {
    System.out.println("\n\nInside threeDimensionalArrays ...");

    int[][][] unitsSold = new int[][][] {
        { // New York
            { 0, 0, 0, 0 }, // Jan
            { 0, 0, 0, 0 }, // Feb
            { 0, 0, 0, 0 }, // Mar
            { 0, 850, 0, 0 }// Apr
        },
        { // San Francisco
            { 0, 0, 0, 0 }, // Jan
            { 0, 0, 0, 0 }, // Feb
            { 0, 0, 0, 0 }, // Mar
            { 0, 0, 0, 0 } // Apr
        },
        {
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 }
        },
        {
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 }
        }
    };

    System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
  }

  static double sum(double x, double y) {
    return (x + y);
  }

  static double avg(double x, double y) {
    double sum = sum(x, y);
    return sum / 2;
  }

  static boolean search(int[] list, int key) {
    return true;
  }

  static void go(int[] array) {
    System.out.println("array[0]: " + array[0]);
    System.out.println("array[1]: " + array[1]);
    array[1] = 22;
  }

  static void go(int i) {
    System.out.println("go(int i)");
  }

  static void go(short s) {
    System.out.println("go(short s)");

  }

  static void varargsOverload(boolean b, int i, int j, int k) {
    System.out.println("\n\nInside varargsOverload without varargs...");
  }

  static void varargsOverload(boolean b, int... list) {
    System.out.println("\n\nInside varargsOverload with varargs...");
    System.out.println("list.length: " + list.length);
  }

  static void preAndPost() {
    System.out.println("\n\nInside preAndPost...");

    int x = 5;
    --x;
    System.out.println("x: " + x);

    int y = x--;
    System.out.println("y: " + y + ", x: " + x);

    int index = 0;
    int[] array = new int[3];

    array[index++] = 10;
    array[index++] = 20;
    array[index++] = 30;

    System.out.println(index);
  }

  static void compoundArithmeticAssignment() {
    System.out.println("\n\nInside compoundArithmeticAssignment...");

    int x = 100;

    System.out.println("x += 5: " + (x += 5));
    System.out.println("x -= 5: " + (x -= 5));
    System.out.println("x *= 5: " + (x *= 5));
    System.out.println("x /= 5: " + (x /= 5));
    System.out.println("x %= 5: " + (x %= 5));

    // Invalid
    // System.out.println("x =+ 5: " + (x =+ 5)); // Unary plus: x = +5
    // System.out.println("x =- 5: " + (x =- 5)); // Unary minus: x = -5
    // System.out.println("x =* 5: " + (x =* 5)); // Compilation Errors
    // System.out.println("x =/ 5: " + (x =/ 5)); // Compilation Errors
    // System.out.println("x =% 5: " + (x =% 5)); // Compilation Errors
  }

  static void isOddOrEven(int num) {
    System.out.println(num % 2);
  }

  static void charTypePromotion() {
    System.out.println("\n\nInside charTypePromotion...");

    char char1 = 50; // Will be assigned corresponding to UTF-16 value 2
    System.out.println("char1: " + char1);
    System.out.println("(73 - char1): " + (73 - char1)); // char 1 gets promoted to int i.e. decimal equivalent 50 in
                                                         // UTF-16 is used
    System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to int

    // prettier-ignore
    System.out.println("('a' + 'b'): " + ('a' + 'b')); // 'a' & 'b' are promoted ot int and the respective equivalents
                                                       // 97 & 98 are added
  }

  static boolean update(Student s, String name) {

    // if (s == null) {
    // return false;
    // }

    // s.name = name;

    if (s != null && s.id > 1000) {
      s.name = name;
    }

    return true;
  }

  static void comparisonOperators() {
    System.out.println("\n\nInside comparisonOperators...");

    int age = 25;

    if (age > 21) {
      System.out.println("Graduate Student");
    }

    System.out.println("age > 21: " + (age > 21));
    System.out.println("age >= 21: " + (age >= 21));
    System.out.println("age < 21: " + (age < 21));
    System.out.println("age <= 21: " + (age <= 21));
    System.out.println("age == 21: " + (age == 21)); // equal to (equality operator)
    System.out.println("age != 21: " + (age != 21)); // not equal to (equality operator)

    boolean isInternational = true;

    // System.out.println("isInternational <= true: " + (isInternational <= true));
    // // invalid
    System.out.println("isInternational == true: " + (isInternational == true));
    System.out.println("isInternational != true: " + (isInternational != true));

    Student s1 = new Student(1000, "John");
    Student s2 = new Student(1000, "John");

    System.out.println("s1 == s2: " + (s1 == s2));
    System.out.println("s1 != s2: " + (s1 != s2));

    update(null, "John");
  }

  static void logicalOperators() {
    System.out.println("\n\nInside logicalOperators...");
    int age = 37;
    int salary = 85000;
    boolean hasBadCredit = false;

    // 1. Core (AND, OR, NOT & Operator Chaining)

    if (age > 35 && salary > 90000 || !hasBadCredit) {
      System.out.println("Loan approved!");
    } else {
      System.out.println("Loan not approved!");
    }

    /*
     * 2.
     * 
     * (a) Left-associative ~ Order of grouping
     * (b) Associativity (a && b) && c = a && (b && c)
     * Applies to both && and ||
     */

    /*
     * 3.
     * 
     * (a) Operator precedence of Logical Operators: Helps with ONLY
     * grouping operations. Not order of execution. (! > && > ||)
     */

    /*
     * Other Examples:
     * A && B || C && D = (A && B) || (C && D)
     * A && B && C || D = ((A && B) && C) || D
     */

    /*
     * (b) Operator Precedence across logical, comparison and arithmetic:
     * ! > arithmetic > comparison > &&, ||
     * 
     * See resources section for complete precedence rules
     */

    /*
     * ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of
     * precedence rules.
     */

    // 4. Use && to avoid NullPointerException
    Student s1 = new Student(1001, "Ayan");
    update(s1, "Aryan");
  }

  public static void main(String[] args) {

    logicalOperators();

    // comparisonOperators();

    // charTypePromotion();

    // isOddOrEven(50);
    // compoundArithmeticAssignment();
    // preAndPost();

    // varargsOverload(true, 1, 2, 3);
    // varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);
    // varargsOverload(true);

    // byte b = 22;
    // go(b);

    // go(1000);

    // int[] array = { 1, 2 };
    // go(array);
    // System.out.println("array[1]: " + array[1]);

    // float d = (float) sum(2.0f, (float) 3.0);
    // System.out.println(d);

    // double d2 = avg(3.0, 2.0);
    // System.out.println(d2);

    // int[] list = { 1, 2 };
    // search(list, 2);
    // search(new int[] { 1, 2 }, 2);

    // threeDimensionalArrays();

    // arrays();

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