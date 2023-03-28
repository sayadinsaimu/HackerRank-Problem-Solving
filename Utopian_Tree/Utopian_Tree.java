package Utopian_Tree;

import java.io.*;

class Result {

	public static int utopianTree(int n) {
		if (n == 0)
			return 1;
		int height = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				height = height * 2;
			} else
				height = height + 1;
		}
		return height;
	}
}

public class Utopian_Tree {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());
		for (int tItr = 0; tItr < t; tItr++) {
			int n = Integer.parseInt(bufferedReader.readLine().trim());
			int result = Result.utopianTree(n);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}
		bufferedReader.close();
		bufferedWriter.close();
	}
}
