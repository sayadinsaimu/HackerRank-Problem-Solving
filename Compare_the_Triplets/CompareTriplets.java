package Compare_the_Triplets;

import java.io.*;
import java.util.*;

class Result {
	// write your code here
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<>();
		int AlicePoint = 0;
		int BobPoint = 0;

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				AlicePoint = AlicePoint++;
			} else if (a.get(i) < b.get(i)) {
				BobPoint = BobPoint++;
			} else
				continue;
		}
		result.add(AlicePoint);
		result.add(BobPoint);
		return result;
	}

}

public class CompareTriplets {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int aItem = Integer.parseInt(aTemp[i]);
			a.add(aItem);
		}

		String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		List<Integer> b = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int bItem = Integer.parseInt(bTemp[i]);
			b.add(bItem);
		}
		List<Integer> result = Result.compareTriplets(a, b);
		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(String.valueOf(result.get(i)));
			if (i != result.size() - 1) {
				bufferedWriter.write(" ");
			}
		}
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();

	}
}
