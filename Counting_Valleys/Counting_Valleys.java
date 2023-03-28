package Counting_Valleys;

import java.io.*;

class Result{

	public static int countingValleys(int steps, String path) {
		int level = 0;
        	int valley = 0;
        	for(int i =0; i<path.length();i++) {
           		if(path.charAt(i) == 'U'){
                		level++;
            		}
			else if(path.charAt(i) == 'D'){
                		if(level == 0){
                    			valley++;
                		}
               			level--;
            		}
        	}
        	return valley;
	}	
}

public class Counting_Valleys {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int steps = Integer.parseInt(bufferedReader.readLine().trim());
		String path = bufferedReader.readLine();
		int result = Result.countingValleys(steps,path);
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
