package Designer_PDF_Viewer;

import java.io.*;
import java.util.*;

class Result {

	public static int designerPdfViewer(List<Integer> h, String word) {
		int maxHeight =0;
		for(char letter: word.toCharArray()) {
			int index = letter -'a'; // find the index value of "letter" by subtracting the ascii value of both 'a' and 'letter'   
			if(h.get(index)> maxHeight) {
				maxHeight = h.get(index);
			}
		}
		return word.length()*1*maxHeight;
	}
}

public class Designer_PDF_Viewer {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] hTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> h = new ArrayList<>();

		for (int i = 0; i < 26; i++) {
			int hItem = Integer.parseInt(hTemp[i]);
			h.add(hItem);
		}
		String word = bufferedReader.readLine();
		int result = Result.designerPdfViewer(h, word);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
