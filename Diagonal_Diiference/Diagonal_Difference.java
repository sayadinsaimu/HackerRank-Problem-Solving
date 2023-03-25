package Diagonal_Diiference;

import java.io.*;
import java.util.*;

//....This code is not working on locally 
//....but it is finely submitted to hackerrank
class Result {

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int difference = 0;
		int leftSum = 0;
		int rightSum = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if (i == j) {
					leftSum = leftSum + arr.get(i).get(j);
				}
				if ((i + j) == (arr.size() - 1)) {
					rightSum = rightSum + arr.get(i).get(j);
				}
			}

		}
		difference = leftSum - rightSum;

		return Math.abs(difference);
	}

}

public class Diagonal_Difference {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> arrRowItems = new ArrayList<>();

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowTempItems[j]);
				arrRowItems.add(arrItem);
			}

			arr.add(arrRowItems);
		}

		int result = Result.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
