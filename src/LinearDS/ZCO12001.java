package LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ZCO12001 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int seqlength = Integer.parseInt(br.readLine());
		String[] sequence = br.readLine().trim().split("\\s+");
		
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0, prevmaxelem = 0, maxelem = 0, prevmaxdepth = 0, maxdepth = 0, plast = 0, pfirst = 0;
		
		for(int i = 0; i<seqlength; i++){

			if(sequence[i].equals("1")){
				stack.push(1); 
				count++;
			}else{
				stack.pop();
				count++;
			}
			
			prevmaxdepth = maxdepth;
			prevmaxelem = maxelem;
			
			if(count > prevmaxelem){
				maxelem = count;
				plast = i - maxelem + 2;
			}

			if(stack.size() > prevmaxdepth){
				maxdepth = stack.size();
				pfirst = i + 1;
			}
			
			if(stack.size() == 0) count = 0;
		}
		System.out.println(maxdepth + " " + pfirst + " " + maxelem + " " + plast);
	}
}
