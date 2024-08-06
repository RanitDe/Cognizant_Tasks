public class StudentGradesTest {
    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();

        // Adding students
        studentGrades.addStudent(new Student(1, "Ram", 'A'));
        studentGrades.addStudent(new Student(2, "Harry", 'B'));
        studentGrades.addStudent(new Student(3, "Ronak", 'C'));

        // Displaying students
        System.out.println("Student grades:");
        studentGrades.displayStudents();

        // Removing a student
        studentGrades.removeStudent(2);

        // Displaying students after removal
        System.out.println("\nStudent grades after removing Bob:");
        studentGrades.displayStudents();

        // Updating a student's grade
        studentGrades.updateStudentGrade(3, 'A');

        // Displaying students after update
        System.out.println("\nStudent grades after updating Charlie's grade:");
        studentGrades.displayStudents();
    }
}
