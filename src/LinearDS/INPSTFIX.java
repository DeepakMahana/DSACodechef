package LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class INPSTFIX {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			int elemcount = Integer.parseInt(br.readLine());
			String input = br.readLine();
			char[] infix = input.toCharArray();
			Stack<Character> stack = new Stack<Character>();
			String postfix = "";
			
			for(int i=0; i<elemcount; i++){
				
				// If any Letter (A,B...) or Digit (1,2...)
				// Then append to postfix string
				if(Character.isLetterOrDigit(infix[i])){
					postfix += infix[i];
				}
				
				// If opening bracket push into stack
				else if(infix[i] == '(') stack.push(infix[i]);
				
				// If closing bracket
				else if(infix[i] == ')'){
					// Pop elements until stack is empty or opening bracket found
					// Append the poped element into postfix
					while(!stack.isEmpty() && stack.peek() != '('){
						postfix += stack.pop();
					}
					stack.pop();
				}
				
				// If any operand is found then check the preference
				else {
					while(!stack.isEmpty() && checkp(infix[i]) <= checkp(stack.peek()) ){
						postfix += stack.pop();
					}
					stack.push(infix[i]);
				}
			}
			
			// If any operators still pending in stack pop it and append to postfix
			while(!stack.isEmpty()){
				postfix += stack.pop();
			}
			System.out.println(postfix);
		}
	}
	
	// Check for operator precedence
	static int checkp(char c){
		switch(c){
			case '+':
			case '-': 
				return 1;
				
			case '*':
			case '/':
				return 2;
				
			case '^':
				return 3;
		}
		return -1;	
	}
}
