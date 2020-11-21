package array;

import java.util.Scanner;

/**
 *  Problem - https://www.codechef.com/problems/BLONDIE
 *  
 *  Solution - 
 *  
 * @author kumar
 *
 */
public class ManWithNoName {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- >0) {
			int n = input.nextInt();
			int arr[] = new int[n];
			for (int i=0; i<n; i++) {
				arr[i] = input.nextInt();
			}
			findBullet(arr, n);
		}
	}

	private static void findBullet(int[] arr, int n) {
		 int sum=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>0) {
				sum = sum+arr[i];
			}
			else {
				// Priting arr[i] so simply diving sum/i as array stat with 0
				arr[i]= sum/i;
				// add sum to sum+arr[i] so for next -1 it will be counted
				sum = sum+arr[i];
			}
			// Printing arr[i] on every Iteration 
			System.out.println(arr[i]);
		}
		
	}

}
