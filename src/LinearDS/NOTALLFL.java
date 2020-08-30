package LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NOTALLFL {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			String[] input = br.readLine().trim().split("\\s+");
			int N = Integer.parseInt(input[0]);
			int K = Integer.parseInt(input[1]);
			String[] inputval = br.readLine().trim().split("\\s+");
			int[] inputarr = Arrays.asList(inputval).stream().mapToInt(Integer::parseInt).toArray();
			int curr = 0, max = 0;
			
			for(int i=1; i <= K; i++){
				curr = 0;
				for(int j=0; j < N; j++){
					if(inputarr[j] == i){
						if(curr > max) max = curr;
						curr = 0;
					}else{
						curr++;
					}
				}
				if(curr > max){
					max = curr;
				}
				if(max == N){
					break;
				}
			}
			System.out.println(max);
		}
	}
}
