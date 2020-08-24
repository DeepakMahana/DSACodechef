package BasicWarmUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MULTHREE {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			// Process Inputs
			String[] inputs = br.readLine().trim().split("\\s+");
			long numcount = Long.parseLong(inputs[0]);
			int num1 = Integer.parseInt(inputs[1]);
			int num2 = Integer.parseInt(inputs[2]);
			int sum = num1 + num2;
			long totalsum = 0L;
			
			if(numcount >= 2) totalsum = sum;
			
			if(numcount >= 3) totalsum += sum % 10;
			
			if(numcount > 3){
				
				int a = (2 * sum) % 10;
                int b = (4 * sum) % 10;
                int c = (8 * sum) % 10;
                int d = (6 * sum) % 10;

                long m = (numcount - 3) / 4;

                totalsum = totalsum + ((a + b + c + d) * m);

                m = (numcount - 3) % 4;

                if (m == 1) totalsum = totalsum + a;
                if (m == 2) totalsum = totalsum + a + b;
                if (m == 3) totalsum = totalsum + a + b + c;
			}
			
			totalsum %= 3;
            if (totalsum == 0) System.out.println("YES");
            else System.out.println("NO");
			
		}
		
	}

}
