package LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZCO12002 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().trim().split("\\s+");
		int N = Integer.parseInt(inputs[0]);
		int X = Integer.parseInt(inputs[1]);
		int Y = Integer.parseInt(inputs[2]);
		
		int[] startTime = new int[N];
		int[] endTime = new int[N];
		
		for(int i=0; i < N; i++){
			String[] contests = br.readLine().trim().split("\\s+");
			int start = Integer.parseInt(contests[0]);
			int end = Integer.parseInt(contests[1]);
			startTime[i] = start;
			endTime[i] = end;
		}
		
		String[] vInputs = br.readLine().trim().split("\\s+");
		int[] vHoleIn = Arrays.asList(vInputs).stream().mapToInt(Integer::parseInt).toArray();
		
		String[] wInputs = br.readLine().trim().split("\\s+");
		int[] wHoleOut = Arrays.asList(wInputs).stream().mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(vHoleIn);
		Arrays.sort(wHoleOut);
		
		int minTime = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++){
			
			int start = startTime[i];
			int end = endTime[i];
			
			int searchStart = Arrays.binarySearch(vHoleIn, start);
			if(searchStart < 0) searchStart = Math.abs(searchStart) - 2;
			
			int searchEnd = Arrays.binarySearch(wHoleOut, end);
			if(searchEnd < 0) searchEnd = Math.abs(searchEnd) - 1;
			
			if(searchStart >= 0 && searchEnd <= Y - 1) {
				minTime = Math.min(minTime, wHoleOut[searchEnd] - vHoleIn[searchStart] + 1);
			}
		}
		System.out.println(minTime);
	}
}
