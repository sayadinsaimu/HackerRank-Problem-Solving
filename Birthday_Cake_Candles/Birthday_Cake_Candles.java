package Birthday_Cake_Candles;

import java.io.*;
import java.util.*;
//....This code is not working on locally 
//....but it is already submitted to hackerrank
class Result {

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
		int tallest = candles.get(0);
		int count = 0;
		for (int i = 1; i < candles.size(); i++) {
			if (candles.get(i) > tallest) {
				tallest = candles.get(i);
			}
		}
		for (int i = 0; i < candles.size(); i++) {
			if (candles.get(i) == tallest) {
				count++;
			}
		}
		return count;
	}

}

public class Birthday_Cake_Candles {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

		String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> candles = new ArrayList<>();

		for (int i = 0; i < candlesCount; i++) {
			int candlesItem = Integer.parseInt(candlesTemp[i]);
			candles.add(candlesItem);
		}

		int result = Result.birthdayCakeCandles(candles);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
