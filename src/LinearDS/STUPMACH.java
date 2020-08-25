package LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class STUPMACH {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			// Preprocess Inputs
			int inputcount = Integer.parseInt(br.readLine());
			String[] inputs = br.readLine().trim().split("\\s+");
			long[] inputarr = Arrays.asList(inputs).stream().mapToLong(Long::parseLong).toArray();
			
			long[] prefixmin = new long[inputcount];
			long maxTokens = 0;
			long currmin = inputarr[0];
			prefixmin[0] = currmin;
			
			for(int i=1; i<inputcount; i++){
				if(currmin > inputarr[i]) currmin = inputarr[i];
				prefixmin[i] = currmin;
			}
			
			for(long elem: prefixmin){
				maxTokens += elem;
			}
			
			System.out.println(maxTokens);
		}
	}
}
