package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Problem - https://www.spoj.com/problems/AGGRCOW/
 *  
 *  Solution - Binary Search 
 *  
 * @author kumar
 *
 */
public class AggresiveCow {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		int t = input.nextInt();
		while (t-- >0) {
			int n = input.nextInt();
			int c = input.nextInt();
			int arr[] = new int[n];
			for (int i=0; i<n; i++) {
				arr[i]= input.nextInt();
			}
			aggesiveCow(c , arr);
		}
	}

	private static void aggesiveCow(int c, int[] arr) {
		//Sort the array
		Arrays.sort(arr);
		// low will be 1
		int low=1;
		int high = findHigh(arr);
		// first cow is places at first places
		int ans=low;
		int count=1;
		while (low<=high) {
			int mid =low +(high-low)/2;
			//first cow is always places at first places 
			int placed =arr[0];
			for (int i=1; i<arr.length;i++) {
				//difference  between stall is greater than mid increase the count
				if (arr[i]-placed >=mid) {
					count++;
					//updated placed
					placed =arr[i];
				}
			}
			//if count is greater than equal to cow
			if (count >= c) {
				//mid can be one of ans but not max
				ans = mid;
				//go right for finding max 
				low=mid+1;
			}
			else {
				//go left
				high=mid-1;
			}
			
		}
		System.out.println(ans);
	}
	private static int findHigh(int[] arr) {
		return arr[arr.length-1]-arr[1];
	}


}
