// public class Student {
//   static int studentCount = 0;
//   int id;
//   String name;
//   String gender;
//   int age;
//   long phone;
//   double gpa;
//   char degree;
//   boolean international;

//   double tuitionFees = 12000.0, internationalFees = 5000.0;

//   Student(int id, String name, String gender, int age, long phone, double gpa, char degree) {
//     this(id, name, gender, age, phone, gpa, degree, false);
//   }

//   Student(int id, String name, String gender, int age, long phone, double gpa, char degree,
//       boolean international) {

//     this.id = id;
//     this.name = name;
//     this.gender = gender;
//     this.age = age;
//     this.phone = phone;
//     this.gpa = gpa;
//     this.degree = degree;
//     this.international = international;

//     studentCount = studentCount + 1;
//     int nextId = id + 1;

//     if (international) {
//       tuitionFees = tuitionFees + internationalFees;
//     }

//     System.out.println();
//     System.out.println("id: " + this.id);
//     System.out.println("nextId: " + nextId);
//     System.out.println("name: " + this.name);
//     System.out.println("gender: " + this.gender);
//     System.out.println("age: " + this.age);
//     System.out.println("phone: " + this.phone);
//     System.out.println("gpa: " + this.gpa);
//     System.out.println("degree: " + this.degree);
//     System.out.println("tuitionFees: " + tuitionFees);
//     System.out.println("computeCount: " + studentCount);
//   }

//   Student() {
//   }

//   boolean updateProfile(String name) {
//     this.name = name;
//     return true;
//   }

//   // static Student student3;

// }

////////////////////////////////////////////

class Student {
  // variable declarations
  int id;
  String name;
  String gender = "male";

  // Constructors
  Student(int id, String name) {
    this(name); // Invoking overloaded constructor. If present, should be first statement
    this.id = id;
  }

  Student(String name) {
    this.name = name;
  }

  Student() {
  }

  // method definitions
  boolean updateProfile(String name) {
    this.name = name;
    return true;
  }

  public static void main(String[] args) {

  }
}