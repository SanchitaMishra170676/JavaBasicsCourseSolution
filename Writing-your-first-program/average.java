package soln;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your marks in 5 sub");
		int m1= sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		
		System.out.println((m1+m2+m3+m4+m5)/5);
	}

}
