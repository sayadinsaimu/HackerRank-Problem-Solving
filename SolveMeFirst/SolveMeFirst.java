package SolveMeFirst;

import java.util.Scanner;

public class SolveMeFirst {
	public static void main(String[] arg) {
		int a, b, sum;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		sum = solveMeFirst(a, b);
		System.out.println(sum);
		in.close();

	}

	private static int solveMeFirst(int a, int b) {

		return a + b;
	}
}
