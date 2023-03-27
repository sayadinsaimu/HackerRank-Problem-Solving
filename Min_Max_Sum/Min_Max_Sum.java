package Min_Max_Sum;
import java.io.*;
import java.util.*;


class Result {
	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here
		List <Long> value = new ArrayList<>();
        	for (int i = 0; i < arr.size(); i++) {
            		long sum = 0;
            		for (int j = 0; j < arr.size(); j++) {
                		if (i == j) {
                    			continue;
                		}
                		sum = sum + arr.get(j);  
            		}
            		value.add(sum);
        	}
        	long maxSum = value.get(0);
       		long minSum = value.get(0);
        	for(int i=1; i<value.size(); i++){
            		if(value.get(i)>maxSum){
                		maxSum = value.get(i);
            		}
            		if(value.get(i)<minSum){
                		minSum = value.get(i);
            		}
        	}
        	System.out.println(minSum + " " + maxSum);
	}
}

public class Min_Max_Sum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}
		Result.miniMaxSum(arr);
		bufferedReader.close();
	}
}
