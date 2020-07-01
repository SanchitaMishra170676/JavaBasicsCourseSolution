package soln;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the nos.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a=" +a+ "\nb=" +b);
		
	}

}
