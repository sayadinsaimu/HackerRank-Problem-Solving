package Hurdle_Race;

import java.io.*;
import java.util.*;

class Result {

	public static int hurdleRace(int k, List<Integer> height) {
		int max = height.get(0);
		for (int i : height) {
			if (i > max) {
				max = i;
			}
		}
		return (max > k) ? max - k : 0;
	}
}

public class Hurdle_Race {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);
		int k = Integer.parseInt(firstMultipleInput[1]);

		String[] heightTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> height = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int heightItem = Integer.parseInt(heightTemp[i]);
			height.add(heightItem);
		}
		int result = Result.hurdleRace(k, height);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
