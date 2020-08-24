package BasicWarmUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CARVANS {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			int inputlength = Integer.parseInt(br.readLine());
			String[] inputs = br.readLine().trim().split("\\s+");
			int[] inputarr = Arrays.asList(inputs).stream().mapToInt(Integer::parseInt).toArray();
			
			// initialization of maxspeed car count
			int prevmin = inputarr[0];
			int maxspeedcarcount = 1;
			
			for(int i=1; i < inputlength; i++){
				if(inputarr[i] < prevmin){
					maxspeedcarcount++;
					prevmin = inputarr[i];
				}
			}
			
			System.out.println(maxspeedcarcount);
			
		}
	}

}
