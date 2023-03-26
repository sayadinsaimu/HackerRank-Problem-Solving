package Plus_Minus;

import java.io.*;
import java.text.*;
import java.util.*;

class Result {

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				positive = positive + 1;
			} else if (arr.get(i) < 0) {
				negative = negative + 1;
			} else {
				zero = zero + 1;
			}
		}

		DecimalFormat df = new DecimalFormat("0.000000");
		System.out.println(df.format((double) positive / arr.size()));
		System.out.println(df.format((double) negative / arr.size()));
		System.out.println(df.format((double) zero / arr.size()));
	}
}

public class Plus_Minus {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}

		Result.plusMinus(arr);

		bufferedReader.close();
	}
}
