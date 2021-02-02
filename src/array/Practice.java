package array;

import java.util.Arrays;

public class Practice {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int prefixSum[] = createPrefixSum(arr);
		int res = getSum(arr , 3 , 5, prefixSum);
		System.out.println(res);
	}

	private static int[]  createPrefixSum(int arr[]) {
		//Take PrefixSum array of same length 
		int prefixSum[] = new int[arr.length];
		for (int i=0; i<arr.length; i++) {
			if (i==0) {
				// assign the first value to prefix array
				prefixSum[0]=arr[0];
			}
			else {
				// from first index onwards add previous value plus arr[i]
				prefixSum[i]=prefixSum[i-1]+arr[i];
			}
		}
		System.out.println(Arrays.toString(prefixSum));
		return prefixSum;
	}
	
	private static int getSum(int arr[], int l, int r, int prefixSum[]) {
		if (l !=0) {
			// l-1 as array index start with 0
			return prefixSum[r]-prefixSum[l-1]; 
		}
		return prefixSum[r];
	}
}
