package LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PSHOT {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			// Preprocess Inputs
			int totalTurn = Integer.parseInt(br.readLine());
			String[] goals = br.readLine().trim().split("");
			int aGoals = 0, bGoals = 0, aPassRem = totalTurn, bPassRem = totalTurn;
			int winPasses = 0; 
			
			// Loop through the Goals Array to count the total Goals
			for(int i=0; i<goals.length; i++){
				
				// Team A's Turn
				if(i%2 == 0){
					if(goals[i].equals("1")) aGoals++;
					aPassRem--;
				}else{
					// Team B's Turn
					if(goals[i].equals("1")) bGoals++;
					bPassRem--;
				}
				
				// Check if winner found
				if((aGoals > bGoals + bPassRem) || (bGoals > aGoals + aPassRem)){
					winPasses = i;
					break;
				}
			}
			
			// If early winner found
			if(winPasses > 0){
				System.out.println(winPasses + 1);
			}else{
				System.out.println(goals.length);
			}
		}
	}
}
