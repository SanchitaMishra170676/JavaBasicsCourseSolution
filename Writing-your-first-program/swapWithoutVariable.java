package soln;

import java.util.Scanner;

public class swapWithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the nos.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println("a=" +a+ " "+"b=" +b);

	}

}
