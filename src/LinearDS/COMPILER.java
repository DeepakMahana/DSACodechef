package LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COMPILER {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			String[] brackets = br.readLine().trim().split("");
			int maxprefix = 0;
			int length = 0;
			
			for(int i=0; i<brackets.length; i++){
				if(brackets[i].equals("<")) length++;
				else length--;
				if(length < 0) break;
				if(length == 0) maxprefix = i + 1;
			}
			System.out.println(maxprefix);
		}
	}
}
