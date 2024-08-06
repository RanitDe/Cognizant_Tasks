## Exercise 8: Student Grades with LinkedHashMap

## Objectives:
•	Understand and use the LinkedHashMap class.
•	Maintain insertion order of key-value pairs.

## Business Scenario: 
You are developing a system to store and manage students' grades. The system should maintain the order in which students were added.
Tasks:
1.	Create a New Java Project:
•	Create a new Java project named StudentGrades.
2.	Create a Student Class:
•	In the StudentGrades project, create a class named Student with attributes id (int), name (String), and grade (char).
3.	Create a StudentGrades Class:
•	Create a class named StudentGrades with a LinkedHashMap<Integer, Student> to store students' grades while preserving insertion order.
4.	Add Students:
•	Implement a method addStudent(Student student) to add a student and their grade to the system.
5.	Remove Students:
•	Implement a method removeStudent(int studentId) to remove a student by their ID.
6.	Update Student Grades:
•	Implement a method updateStudentGrade(int studentId, char newGrade) to update a student's grade.
7.	Display Students:
•	Implement a method displayStudents() to display all students and their grades.
8.	Testing:
•	Create a main class StudentGradesTest with a main method.
•	Add, remove, update, and display students using the StudentGrades class.
