package Min_Max_Sum;
import java.io.*;
import java.util.*;


class Result {
	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here
		List<Integer> value = new ArrayList<>();
		long maxSum = Long.MIN_VALUE;
		long minSum = Long.MAX_VALUE;
		for (int i = 0; i < arr.size(); i++) {
			int sum = 0;
			for (int j = 0; j < arr.size(); j++) {
				if (i == j) {
					continue;
				}
				sum = sum + arr.get(j);
			}
			minSum = Math.min(minSum, sum);
			maxSum = Math.max(maxSum, sum);
		}
		System.out.println(minSum + " " + maxSum);
	}
}

public class Min_Max_Sum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}
		Result.miniMaxSum(arr);
		bufferedReader.close();
	}
}
