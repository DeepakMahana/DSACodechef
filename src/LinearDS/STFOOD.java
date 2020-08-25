package LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class STFOOD {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			int maxProfit = 0;
			int tests = Integer.parseInt(br.readLine());

			while(tests-- > 0){
				
				String[] inputs = br.readLine().trim().split("\\s+");
				int noOfStores = Integer.parseInt(inputs[0]) + 1;
				int noOfPeople = Integer.parseInt(inputs[1]);
				int foodPrice = Integer.parseInt(inputs[2]);
				int profit = ( noOfPeople / noOfStores ) * foodPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
			
			System.out.println(maxProfit);	
		}
	}
}
