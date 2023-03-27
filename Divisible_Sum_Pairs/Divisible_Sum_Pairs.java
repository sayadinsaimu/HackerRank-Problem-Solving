package Divisible_Sum_Pairs;

import java.io.*;
import java.util.*;
//....This code is not working on locally 
//....but it is already submitted to hackerrank

class Result {

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		// Write your code here
		int count = 0;
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar.get(i) + ar.get(j)) % k == 0) {
					count++;
				}
			}
		}
		return count;
	}
}

public class Divisible_Sum_Pairs {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> ar = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arTemp[i]);
			ar.add(arItem);
		}

		int result = Result.divisibleSumPairs(n, k, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
