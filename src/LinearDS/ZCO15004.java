package LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ZCO15004 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ptCount = Integer.parseInt(br.readLine());
		
		int[] y = new int[100005];
		int[] left = new int[100005];
		int[] right = new int[100005];
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		Arrays.fill(y, 500);
		Arrays.fill(right, 100000);
		
		y[0] = 0;
		y[100000] = 0;
		
		while(ptCount-- > 0){
			String[] pts = br.readLine().trim().split("\\s+");
			int xco = Integer.parseInt(pts[0]);
			int yco = Integer.parseInt(pts[1]);
			y[xco] = Math.min(y[xco], yco);
		}

		for (int i = 0; i <= 100000; i++) {
			while (!dq.isEmpty() && y[dq.peek()] >= y[i]) {
				dq.pop();
			}
			if (dq.isEmpty()){
				left[i] = 0;
			} else {
				left[i] = dq.peek();
			}
			if (y[i] != 500) dq.push(i);
		}

		while (!dq.isEmpty()) {
			dq.pop();
		}

		for (int i = 100000; i >= 0; i--) {
			while (!dq.isEmpty() && y[dq.peek()] > y[i]) {
				dq.pop();
			}
			if (dq.isEmpty()) {
				right[i] = 100000;
			} else {
				right[i] = dq.peek();
			}
			if (y[i] != 500) dq.push(i);
		}

		long maxArea = 1L;
		long temp = 0;

		for (int i = 0; i <= 100000; i++) {
			temp = y[i] * (right[i] - left[i]);
			maxArea = Math.max(maxArea, temp);
		}
		System.out.println(maxArea);
	}
}
