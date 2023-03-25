package A_Very_BigSum;

import java.io.*;
import java.util.*;
//....This code is not working on locally 
//....but it is finely submitted to hackerrank
class Result {

	public static long aVeryBigSum(List<Long> ar) {
		// Write your code here
		long sum = 0;
		for (int i = 0; i < ar.size(); i++) {
			sum = sum + ar.get(i);
		}
		return sum;
	}

}

public class Very_BigSum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = Integer.parseInt(bufferedReader.readLine().trim());

		String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Long> ar = new ArrayList<>();

		for (int i = 0; i < arCount; i++) {
			long arItem = Long.parseLong(arTemp[i]);
			ar.add(arItem);
		}

		long result = Result.aVeryBigSum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
