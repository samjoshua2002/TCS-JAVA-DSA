package greensjava.Abstract;

import java.util.Scanner;

abstract class StudentDetails {
    String name;
    int age;
    int rollnumber;
    String address;
    public void DisplayDetails(){
        System.out.println("THe name of the student is: "+ name);
        System.out.println("THe age of the student is: "+ age);
        System.out.println("Rollnumber of the student: "+ rollnumber);
        System.out.println("THe address of the student is: "+ address);
    }
    abstract void inputdetails();

    
}
class details extends StudentDetails{




    
    public void inputdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the student: ");
        name=sc.nextLine();
        System.out.print("Enter the age of the student: ");
        age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the rollnumber of the student: ");
        rollnumber=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the address of the student: ");
        address=sc.nextLine();
        sc.close();

    }

}


public class Form {
    public static void main(String[] args) {
        details d = new details();
        d.inputdetails();
        d.DisplayDetails();
    }

    
}