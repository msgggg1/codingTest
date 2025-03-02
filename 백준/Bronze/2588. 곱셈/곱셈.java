import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int D = Integer.parseInt(br.readLine());
			int A = br.read() -'0';
			int B = br.read() -'0';
			int C = br.read() -'0';
		
			System.out.println(D*C);
			System.out.println(D*B);
			System.out.println(D*A);
			System.out.println(D*(100*A+10*B+C));
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	} // main

} //class