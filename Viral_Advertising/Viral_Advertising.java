package Viral_Advertising;

import java.io.*;


class Result {

	public static int viralAdvertising(int n) {
	
		int shared = 5;
		int liked = 0;
		int cumulative = 0;
		for(int i =1; i<=n ;i++) {
			liked = shared / 2;
			cumulative = cumulative + liked;
			shared = liked * 3;
		}
		return cumulative;
	}
}

public class Viral_Advertising {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		int result = Result.viralAdvertising(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
