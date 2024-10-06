package greensjava.DayFive;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.print("Enter the year : ");
		Scanner sc =new Scanner(System.in);
		int year=sc.nextInt();
		if (year%4==0) {
			System.out.println("Yes its Leap Year");
			
		}else {
			System.out.println("Its not a Leap Year");
		}
		sc.close();
	}

}
