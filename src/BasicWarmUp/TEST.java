package BasicWarmUp;

import java.util.Scanner;

public class TEST {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number;
		
		while(true){
			number = sc.nextInt();
			if(number != 42){
				System.out.println(number);
			}else{
				break;
			}
		}
		
	}

}
