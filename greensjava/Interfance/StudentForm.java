package greensjava.Interfance;

import java.util.Scanner;

interface StudentDetails {
    void inputDetails(); 
    void displayDetails(); 
}

class Student implements StudentDetails {
    String name;
    int age;
    int rollNumber;
    String address;

    @Override
    public void inputDetails() {
        // Keep using the same Scanner object; don't close it here.
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter name of the student: ");
        name = sc.nextLine();
        System.out.print("Enter the age of the student: ");
        age = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter the roll number of the student: ");
        rollNumber = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter the address of the student: ");
        address = sc.nextLine();
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Address: " + address);
        System.out.println();
    }
}

public class StudentForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].inputDetails();
        }

        System.out.println("\nDisplaying all student details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Details of Student " + (i + 1) + ":");
            students[i].displayDetails();
        }

        sc.close();  
    }
}
