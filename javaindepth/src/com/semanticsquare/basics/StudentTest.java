public class StudentTest {

  static void swap(Student[] students, int firstIndex, int secondIndex) {
    Student temp = students[firstIndex];
    students[firstIndex] = students[secondIndex];
    students[secondIndex] = temp;
  }

  public static void main(String[] args) {
    Student student1 = new Student(1000, "Joan", "Male", 18, 223_456_7890L, 3.8,
        'B');

    Student student2 = new Student(1001, "Raj", "Male", 21, 223_456_9999L, 3.4,
        'M', true);

    Student student3 = new Student(1002, "Anita", "Female", 20, 223_456_8888L,
        4.0, 'M', true);

    System.out.println("\nStudent.studentCount: " + Student.studentCount);

    System.out.println("\nName of Student 1: " + student1.name);
    System.out.println("Name of Student 2: " + student2.name);
    System.out.println("Name of Student 3: " + student3.name);

    student1.updateProfile("John");
    System.out.println("\nUpdated name of Student 1: " + student1.name);

    // Student student4 = student1;
    // System.out.println("Name of student 4: " + student4.name);

    // student4.updateProfile("Mike");
    // System.out.println("Name of student 1: " + student1.name);

    // student4 = student2;
    // System.out.println("Name of student 4: " + student4.name);

    // student2 = student1;
    // System.out.println("Name of student 4: " + student4.name);
    // System.out.println("Name of student 2: " + student2.name);

    // student4 = new Student();
    // student4.updateProfile("Alex");
    // System.out.println("Name of student 4: " + student4.name);
    // System.out.println("Name of student 2: " + student2.name);
    // System.out.println("Name of student 1: " + student1.name);

    Student[] students = { student1, student2, student3 };
    swap(students, 0, 2);
  }
}