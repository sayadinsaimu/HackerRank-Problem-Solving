package ArraySum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

	public static int simpleArraySum(List<Integer> ar) {
		int sum = 0;
		for (int i = 0; i < ar.size(); i++) {
			sum = sum + ar.get(i);
		}
		return sum;
	}

}

public class Solution {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			List<Integer> ar = new ArrayList<>();
			System.out.print("Enter the array size: ");
			int n = input.nextInt();
			for (int i = 0; i < n; i++) {
				ar.add(input.nextInt());
			}
			int result = Result.simpleArraySum(ar);
			System.out.println(result);
		}
	}

}
