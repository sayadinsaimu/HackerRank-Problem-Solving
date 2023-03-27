package Apple_Orange;

import java.io.*;
import java.util.*;

class Result {

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		// Write your code here
		int appleCount = 0;
		int orangeCount = 0;
		for (int i = 0; i < apples.size(); i++) {
			int appleLand = a + (apples.get(i));
			if (appleLand >= s && appleLand <= t) {
				appleCount = appleCount + 1;
			}
		}
		System.out.println(appleCount);
		for (int i = 0; i < oranges.size(); i++) {
			int orangeLand = b + (oranges.get(i));
			if (orangeLand >= s && orangeLand <= t) {
				orangeCount = orangeCount + 1;
			}
		}
		System.out.println(orangeCount);
	}

}

public class Apple_Orange {
	public static void main(String[] args) throws IOException {
	
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int s = Integer.parseInt(firstMultipleInput[0]);

		int t = Integer.parseInt(firstMultipleInput[1]);

		String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int a = Integer.parseInt(secondMultipleInput[0]);

		int b = Integer.parseInt(secondMultipleInput[1]);

		String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int m = Integer.parseInt(thirdMultipleInput[0]);

		int n = Integer.parseInt(thirdMultipleInput[1]);

		String[] applesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> apples = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int applesItem = Integer.parseInt(applesTemp[i]);
			apples.add(applesItem);
		}

		String[] orangesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> oranges = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int orangesItem = Integer.parseInt(orangesTemp[i]);
			oranges.add(orangesItem);
		}

		Result.countApplesAndOranges(s, t, a, b, apples, oranges);

		bufferedReader.close();
	}
}
