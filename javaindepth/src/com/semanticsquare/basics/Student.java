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

//   Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree) {
//     this(newId, newName, newGender, newAge, newPhone, newGpa, newDegree, false);
//   }

//   Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree,
//       boolean isInternational) {
//     id = newId;
//     name = newName;
//     gender = newGender;
//     age = newAge;
//     phone = newPhone;
//     gpa = newGpa;
//     degree = newDegree;
//     international = isInternational;

//     studentCount = studentCount + 1;
//     int nextId = id + 1;

//     if (international) {
//       tuitionFees = tuitionFees + internationalFees;
//     }

//     System.out.println();
//     System.out.println("id: " + id);
//     System.out.println("nextId: " + nextId);
//     System.out.println("name: " + name);
//     System.out.println("gender: " + gender);
//     System.out.println("age: " + age);
//     System.out.println("phone: " + phone);
//     System.out.println("gpa: " + gpa);
//     System.out.println("degree: " + degree);
//     System.out.println("tuitionFees: " + tuitionFees);
//     System.out.println("computeCount: " + studentCount);
//   }

//   Student() {
//   }

//   // static Student student3;

//   public static void main(String[] args) {
//     Student student1 = new Student(1000, "John", "Male", 18, 223_456_7890L, 3.8, 'B');

//     Student student2 = new Student(1001, "Raj", "Male", 21, 223_456_9999L, 3.4, 'M', true);

//     Student student3 = new Student(1002, "Anita", "Female", 20, 223_456_8888L, 4.0, 'M', true);

//     System.out.println("Student.studentCount: " + Student.studentCount);
//   }
// }

public class Student {
  int id;
  String name;
  double gpa;

  Student(int newId, String newName) {
    // using the instance variable `id` here instead of local variable `newId`
    // invalid
    this(id, "John", 3.5); // Error: cannot reference id before supertype constructor has been called.
  }

  Student(int newId, String newName, double newGpa) {
    id = newId;
    name = newName;
    gpa = newGpa;
  }
}