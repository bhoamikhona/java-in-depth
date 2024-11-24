public class Student {
  int id = 1000;

  byte age = 18;
  long phone = 2_23_45_67_890L;

  double gpa = 3.4d;

  char degree = '\u0042';

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
    System.out.println("phone: " + phone);
    System.out.println("gpa: " + gpa);
    System.out.println("degree: " + degree);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}