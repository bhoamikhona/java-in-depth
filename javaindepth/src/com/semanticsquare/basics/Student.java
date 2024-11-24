public class Student {
  int id = 1000;

  byte age = 18;
  long phone = 2_23_45_67_890L;
  double gpa = 3.4d;
  char degree = 'B';

  boolean international;
  double tuitionFees = 12000.0;

  double internationalFees = 5000.0;

  void compute() {
    int nextId = id + 1;

    if (international) {
      tuitionFees = tuitionFees + internationalFees;
    }

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
    System.out.println("phone: " + phone);
    System.out.println("gpa: " + gpa);
    System.out.println("degree: " + degree);
    System.out.println("tuitionFees: " + tuitionFees);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}