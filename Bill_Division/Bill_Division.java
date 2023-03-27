package Bill_Division;

import java.io.*;
import java.util.*;

class Result {
	public static void bonAppetit(List<Integer> bill, int k, int b) {
		// write your code here
		int billSum = 0;
		for (int i = 0; i < bill.size(); i++) {
			if (i == k) {
				continue;
			}
			billSum = billSum + bill.get(i);
		}
		int billHalf = billSum / 2;
		if (billHalf == b) {
			System.out.println("Bon Appetit");
		}
		if (billHalf < b) {
			System.out.println(b - billHalf);
		}
	}
}

public class Bill_Division {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);
		int k = Integer.parseInt(firstMultipleInput[1]);

		String[] billTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> bill = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int billItem = Integer.parseInt(billTemp[i]);
			bill.add(billItem);
		}
		int b = Integer.parseInt(bufferedReader.readLine().trim());
		Result.bonAppetit(bill, k, b);
		bufferedReader.close();
	}
}
