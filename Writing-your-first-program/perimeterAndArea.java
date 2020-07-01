package soln;

import java.util.Scanner;

public class perimeterAndArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the radius");
		int r = sc.nextInt();
		System.out.println("Area = "+ 3.14*r*r + "\nPerimeter =" + 2*3.14*r);

	}

}
