import java.util.Scanner;

import javax.swing.JFrame;

public class Calculator {
	static String greeting =("Go buy a new calculator,this is a trash calculator");
	int result;
	static Scanner scan = new Scanner(System.in);
	 static int one = scan.nextInt();
	 static int two=scan.nextInt();

	static Calculator calc = new Calculator();

	public static void main(String[] args) {
		calc.add(one, two);
		System.out.println(greeting);

	}

	public int add(int one, int two) {
		result = one + two;
		System.out.println(result);

		return result;

	}

	public int multiply(int one, int two) {
		result = one * two;
		System.out.println(result);

		return result;

	}

	public int subtract(int one, int two) {
		result = one - two;
		System.out.println(result);

		return result;

	}

	public int divide(int one, int two) {
		result = one / two;
		System.out.println(result);
		return result;

	}

}
