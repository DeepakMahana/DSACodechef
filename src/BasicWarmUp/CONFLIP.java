package BasicWarmUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CONFLIP {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			int innertestcases = Integer.parseInt(br.readLine());
			while(innertestcases-- > 0){
				
				// Preprocess Inputs
				String[] inputs = br.readLine().trim().split("\\s+");
				int start = Integer.parseInt(inputs[0]);
				int flips = Integer.parseInt(inputs[1]);
				int countfor = Integer.parseInt(inputs[2]);
				
				// If iterations is even then H will be flips/2 and T will be flips/2
				// Hence the count of both T and H will be same
				if(flips % 2 == 0){
					System.out.println(flips/2);
				}else{
					// If starting with all H and also count req for H
					if(start == countfor){
						System.out.println(flips/2);
					}else{
						// If starting all T and also count req for T
						System.out.println(flips/2 + 1);
					}
				}
			}
			
		}
		
	}

}
