package BasicWarmUp;

import java.util.Scanner;

public class FLOW007 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		
		while(testcases > 0){
			
			int elem = sc.nextInt();
			int revelem = 0;
			
			while(elem > 0){
				int rem = elem % 10;
				revelem = revelem*10 + rem;
				elem = elem / 10;
			}
			
			System.out.println(revelem);
			
			testcases--;
		}
		
	}
}
