import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int leapYear = (year%4==0) && year%100!=0 || year%400==0? 1 : 0;
		System.out.println(leapYear);
		

	} // main

} // class