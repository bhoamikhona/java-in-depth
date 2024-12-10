import java.math.BigDecimal;
import java.time.Month;

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

  static void bitwiseOperators() {
    System.out.println("\n\nInside bitwiseOperators...");
    int x = 1;
    int y = 3;

    System.out.println("x & y: " + (x & y));
    System.out.println("x | y: " + (x | y));
    System.out.println("x ^ y: " + (x ^ y));
    System.out.println("~x: " + (~x));
    System.out.println("true & false: " + (true & false));

    char c1 = 'a'; // U+0061 --> 0110 0001
    char c2 = 'b'; // U+0062 --> 0110 0010
    System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal

    // Since bitwise work only on Integer types, following will not compile
    // double d1 = 3.14;
    // double d2 = 5.15;
    // System.out.println("d1 | d2: " + d1 | d2);
  }

  static boolean ifStatement() {
    boolean approved = false;

    int age = 27;
    int salary = 60000;
    boolean hasBadCredit = false;

    if (age >= 25 && age <= 35 && salary >= 50000) {
      approved = true;
      System.out.println("age >= 25 && age <= 35 && salary >= 50000");
    } else if (age > 35 && age <= 45 && salary >= 70000) {
      approved = true;
      System.out.println("age > 35 && age <= 45 && salary >= 70000");
    } else if (age > 45 && age <= 55 && salary >= 90000) {
      approved = true;
      System.out.println("age > 45 && age <= 55 && salary >= 90000");
    } else {
      if (age > 55 && !hasBadCredit) {
        approved = true;
        System.out.println("age > 55 && !hasBadCredit");
      }
      System.out.println("else block");
    }

    System.out.println("outside if");
    return approved;
  }

  enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
  };

  static String getSeason(Month month) {
    String season = null;

    switch (month) {
      case JANUARY:
        season = "Spring";
      case FEBRUARY:
        season = "Spring";
      case MARCH:
        season = "Spring";
        break;
      case APRIL:
        season = "Summer";
      case MAY:
        season = "Summer";
      case JUNE:
        season = "Summer";
      case JULY:
        season = "Rainy";
      case AUGUST:
        season = "Rainy";
      case SEPTEMBER:
        season = "Rainy";
      case OCTOBER:
        season = "Winter";
      case NOVEMBER:
        season = "Winter";
      case DECEMBER:
        season = "Winter";
      default:
        season = "unknown";
    }

    return season;
  }

  static String getSeason(byte month) {

    String season = null;

    // if (month == 1) {
    // season = "Spring";
    // } else if (month == 2) {
    // season = "Spring";
    // } else if (month == 3) {
    // season = "Spring";
    // } else if (month == 4) {
    // season = "Summer";
    // } else if (month == 5) {
    // season = "Summer";
    // } else if (month == 6) {
    // season = "Summer";
    // } else if (month == 7) {
    // season = "Rainy";
    // } else if (month == 8) {
    // season = "Rainy";
    // } else if (month == 9) {
    // season = "Rainy";
    // } else if (month == 10) {
    // season = "Winter";
    // } else if (month == 11) {
    // season = "Winter";
    // } else if (month == 12) {
    // season = "Winter";
    // } else {
    // season = "unknown";
    // }

    // Integer temp = null; // Integer.valueOf(month);

    final int temp = 100;

    switch (month) {
      case 1:
        // case null:
        season = "Spring";
      case 2:
        season = "Spring";
        // case 128:
        // case 127:
      case 3:
        season = "Spring";
        break;
      case 4:
        // case 3:
        season = "Summer";
        // case 5:
      case temp:
        season = "Summer";
      case 6:
        season = "Summer";
      case 7:
        season = "Rainy";
      case 8:
        season = "Rainy";
      case 9:
        season = "Rainy";
      case 10:
        season = "Winter";
      case 11:
        season = "Winter";
      case 12:
        season = "Winter";
      default:
        season = "unknown";
    }

    return season;
  }

  // String -> from Java 7
  static String getSeason(String month) {
    String season = null;

    switch (month) {
      case "January":
        season = "Spring";
        break;
      case "February":
        season = "Spring";
        break;
      case "March":
        season = "Spring";
        break;
      case "April":
        season = "Summer";
        break;
      case "May":
        season = "Summer";
        break;
      case "June":
        season = "Summer";
        break;
      case "July":
        season = "Rainy";
        break;
      case "August":
        season = "Rainy";
        break;
      case "September":
        season = "Rainy";
        break;
      case "October":
        season = "Winter";
        break;
      case "November":
        season = "Winter";
        break;
      case "December":
        season = "Winter";
        break;
      default:
        season = "unknown";
        break;
    }

    return season;
  }

  public static void main(String[] args) {

    String season = getSeason((byte) 3);
    // String season = getSeason("March"); // Java 7
    // String season = getSeason(Month.MARCH);

    System.out.println(season);

    // ifStatement();

    // bitwiseOperators();

    // logicalOperators();

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