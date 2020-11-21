package a2oj.codeforce.div2a.fifty.problem;

import java.util.Scanner;

/**
 *  Problem - https://codeforces.com/problemset/problem/4/A
 *  
 *  Solution - 
 *  
 * @author kumar
 *
 */
public class WaterMelon4A {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t =input.nextInt();
		
		while (t != 0) {
			
			if (t%2 ==0) {
				System.out.println("YES");
				System.exit(0);
			}
			else {
				System.out.println("NO");
				System.exit(0);
			}
			t=t/2;
		}
		
		
	}

}
