package BasicWarmUp;

import java.util.Arrays;
import java.util.Scanner;

public class ZCO14003 {
	
	public static void main(String[] args) {
		
		// Process the inputs
		Scanner sc = new Scanner(System.in);
		int tcount = sc.nextInt();
		long[] budget = new long[tcount];
		for(int i=0; i<tcount; i++){
			budget[i] = sc.nextLong();
		}
		
		// Sort the Array
		Arrays.sort(budget);
		
		// Find the max revenue possible
		long maxrev = 0;
		for(int i=0; i<tcount; i++){
			long currev = budget[i] * (tcount - i);
			maxrev = Math.max(maxrev, currev);
		}
		
		System.out.println(maxrev);
	}

}
