import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 불기 연도를 서기 연도로 변환한 결과를 출력한다.
		Scanner scanner = new Scanner(System.in);
		int Byear = scanner.nextInt();
		int year = Byear - 543;

		System.out.println(year);
	} // main

} //class