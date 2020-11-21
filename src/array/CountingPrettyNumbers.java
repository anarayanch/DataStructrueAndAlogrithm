package array;

import java.util.Scanner;

/**
 *  Problem - https://www.codechef.com/problems/NUM239
 *  
 * @author kumar
 *
 */
public class CountingPrettyNumbers {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- >0) {
			int l= input.nextInt();
			int r = input.nextInt();
			int prettyNumCount=0;
			for (int i=l; i <=r; i++) {
				int c = i%10; // This gives the last digit 
				if (c==2 || c==3 || c==9) {
					prettyNumCount++;
				}
			}
			System.out.println(prettyNumCount);
		}
		
		
	}

}
