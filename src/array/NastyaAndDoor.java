package array;

import java.util.Scanner;

/**
 *  Problem - https://codeforces.com/problemset/problem/1341/B
 *  
 *  
 * @author kumar
 *
 */
public class NastyaAndDoor {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- >0) {
			int n= input.nextInt();
			int k = input.nextInt();
			int arr[] = new int[n];
			for (int i=0; i<n; i++) {
				arr[i]= input.nextInt();
			}
		  findSegmentOfMoutain(arr, k );
		}
	}

	private static void findSegmentOfMoutain(int arr[], int k) {
		
		int l=0;
		int r=k-1;
		int peaks=0;
		int maxPeaks=0;
		//start with first Index- As corner Element can not be Peak
		for (int i=1; i <r; i++) {
			if (arr[i]> arr[i-1] && arr[i]> arr[i+1]) {
				peaks++;
			}
		}
		maxPeaks =peaks;
		int ind=0;
		// Slide Window
		while (r != arr.length-1) {
			l++;
			// Check left boundary transition
			if (arr[l] > arr[l+1] && arr[l]>arr[l-1]) peaks--;
			// Check right boundary transition
			if (arr[r] > arr[r+1] && arr[r] > arr[r-1])peaks++;
			r++;
			if (peaks > maxPeaks) {
				maxPeaks = peaks;
				ind =l;
			}
		}
		//Print 
		System.out.println((maxPeaks+1) +" "+ (ind+1));
	}
}
