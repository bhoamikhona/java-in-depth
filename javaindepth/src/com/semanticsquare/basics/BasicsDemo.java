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
  }

  public static void main(String[] args) {
    primitives();

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