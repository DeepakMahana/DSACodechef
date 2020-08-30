package LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class CHFQUEUE {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().trim().split("\\s+");
		int N = Integer.parseInt(inputs[0]);
		String[] inputval = br.readLine().trim().split("\\s+");
		int[] inputarr = Arrays.asList(inputval).stream().mapToInt(Integer::parseInt).toArray();
		Stack<Chef> stack = new Stack<Chef>();
		long fear = 1;
		
		for(int i=0; i<N; i++){
			while(!stack.isEmpty() && stack.peek().rank > inputarr[i]){
				fear = (fear * (i - stack.pop().position + 1)) % 1000000007;
			}
			stack.push(new Chef(i, inputarr[i]));
		}
		System.out.println(fear);
	}
	
	static class Chef {
		int position, rank;
		public Chef(int position, int rank){
			this.position = position;
			this.rank = rank;
		}
	}

}
