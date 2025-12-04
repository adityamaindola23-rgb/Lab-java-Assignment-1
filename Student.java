import java.util.Scanner;

public class Student extends Person {

    private int rollNo;
    private String course;
    private double marks;
    private char grade;

    // Default Constructor
    public Student() {
        super();
        this.rollNo = 0;
        this.course = "";
        this.marks = 0.0;
        this.grade = ' ';
    }

    // Parameterized Constructor
    public Student(int rollNo, String name, String course, double marks) {
        super(name);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    // Input student details
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        // VALIDATION for marks 0–100
        while (true) {
            System.out.print("Enter Marks (0-100): ");
            marks = sc.nextDouble();

            if (marks >= 0 && marks <= 100) break;
            else System.out.println("Invalid Marks! Enter between 0 and 100.");
        }

        calculateGrade();
    }

    // Grade calculation
    public void calculateGrade() {
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else
            grade = 'D';
    }

    // Display student details
    public void displayDetails() {
        System.out.println("\nRoll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
