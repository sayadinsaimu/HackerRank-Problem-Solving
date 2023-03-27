package Breaking_the_Records;

import java.io.*;
import java.util.*;

class Result {
	public static List<Integer> breakingRecords(List<Integer> scores) {
		int max = scores.get(0);
		int min = scores.get(0);
		int highest =0;
		int lowest =0;
		for(int i=1; i<scores.size(); i++) {
			if(scores.get(i)>max) {
				max=scores.get(i);
				highest++;
			}
			if(scores.get(i)<min) {
				min=scores.get(i);
				lowest++;
			}
		}
		List<Integer> result = new ArrayList<>();
		result.add(highest);
		result.add(lowest);
		return result;
	}
}

public class Breaking_the_Records {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		List<Integer> scores = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int scoresItem = Integer.parseInt(scoresTemp[i]);
			scores.add(scoresItem);
		}
		List<Integer> result = Result.breakingRecords(scores);
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
