package BasicWarmUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LADDU {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			int laddus = 0;
			String[] inputs = br.readLine().trim().split("\\s+");
			int contributions = Integer.parseInt(inputs[0]);
			
			// Calculate the total Laddus
			while(contributions-- > 0){
				
				String[] contype = br.readLine().trim().split("\\s+");
				
				switch(contype[0]){
					case "CONTEST_WON": 
						laddus += 300;
						int rank = Integer.parseInt(contype[1]);
						if(rank <= 20){
							laddus+= 20 - rank;
						}
						break;
					case "TOP_CONTRIBUTOR": 
						laddus += 300;
						break;
					case "BUG_FOUND":	
						int bugseverity = Integer.parseInt(contype[1]);
						laddus += bugseverity;
						break;
					case "CONTEST_HOSTED":
						laddus += 50;
					   
				}
				
			}
			
			// Calculate the month require to redeem laddus
			int remainingmonth = inputs[1].equals("INDIAN") ? (laddus / 200) : (laddus / 400);
			System.out.println(remainingmonth);
		}
		
	}

}
