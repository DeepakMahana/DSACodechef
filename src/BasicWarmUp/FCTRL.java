package BasicWarmUp;

import java.util.Scanner;

public class FCTRL {
	
	// Calculate Trailing Zeros in a Factorial
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        
        while(testcases-- > 0){
        	
        	// Take Input Number
        	int number = sc.nextInt();
  
        	int zerocount = 0;
            int divider = 5;
     
            while ((number/divider) > 0) {
                zerocount += number/divider;
                divider = divider * 5;
            }
            System.out.println(zerocount);
        }
        
    }

}
