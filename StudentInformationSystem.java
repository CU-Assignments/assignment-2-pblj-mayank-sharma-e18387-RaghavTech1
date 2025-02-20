package classwork2;

import java.util.Scanner;

//Abstract class Person
abstract class Person {
	protected String name;
	protected int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Abstract method to display details
	public abstract void displayDetails();
}

//Derived class Student
class Student extends Person {
	private int rollNumber;

	// Constructor
	public Student(String name, int age, int rollNumber) {
		super(name, age);
		this.rollNumber = rollNumber;
	}

	// Override method to display details
	@Override
	public void displayDetails() {
		System.out.println("Student Details:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Roll Number: " + rollNumber);
	}
}

//Derived class Teacher
class Teacher extends Person {
	private String subject;

	// Constructor
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	// Override method to display details
	@Override
	public void displayDetails() {
		System.out.println("Teacher Details:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Subject: " + subject);
	}
}

//Main class to demonstrate the student information system
public class StudentInformationSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input details for Student
		System.out.println("Add Student:");
		System.out.print("Name: ");
		String studentName = scanner.nextLine();
		System.out.print("Age: ");
		int studentAge = scanner.nextInt();
		System.out.print("Roll Number: ");
		int studentRollNumber = scanner.nextInt();
		scanner.nextLine(); // Consume newline left-over
		Student student = new Student(studentName, studentAge, studentRollNumber);

		// Input details for Teacher
		System.out.println("Add Teacher:");
		System.out.print("Name: ");
		String teacherName = scanner.nextLine();
		System.out.print("Age: ");
		int teacherAge = scanner.nextInt();
		scanner.nextLine(); // Consume newline left-over
		System.out.print("Subject: ");
		String teacherSubject = scanner.nextLine();
		Teacher teacher = new Teacher(teacherName, teacherAge, teacherSubject);

		// Display details of both student and teacher
		student.displayDetails();
		teacher.displayDetails();

		scanner.close();
	}
}
